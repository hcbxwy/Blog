package com.hcbxwy.blog.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcbxwy.blog.admin.convert.ArticleConverter;
import com.hcbxwy.blog.admin.pojo.cmd.ArticleSaveCmd;
import com.hcbxwy.blog.admin.pojo.vo.ArticleVO;
import com.hcbxwy.blog.admin.service.ArticleService;
import com.hcbxwy.blog.common.utils.ExceptionUtil;
import com.hcbxwy.blog.core.entity.Article;
import com.hcbxwy.blog.core.mapper.ArticleMapper;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 文章表 服务实现类
 *
 * @author hcb
 * @since 2025-12-04 14:10
 */
@Service
@RequiredArgsConstructor
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

    private final ArticleConverter articleConverter;
    private final ArticleMapper articleMapper;

    @Override
    public void save(ArticleSaveCmd cmd) {
        if (isExistSlug(cmd.getSlug())) {
            throw new RuntimeException("slug已被使用");
        }
        Article article = articleConverter.toEntity(cmd);
        article.setUserId(1L)
                .setSummary(generateSummary(article.getContent()));
        save(article);
    }

    @Override
    public ArticleVO getAdminArticle(Long id) {
        Article article = articleMapper.selectById(id);
        ExceptionUtil.throwIfNull(article, "文章不存在");
        return articleConverter.toVO(article);
    }

    private boolean isExistSlug(@NotBlank String slug) {
        return articleMapper.exists(new LambdaQueryWrapper<Article>().eq(Article::getSlug, slug));
    }

    /**
     * 生成文章摘要
     * 截取文章内容前100个字符
     * 超过100字符时加...
     *
     * @param content 文章内容
     */
    private String generateSummary(String content) {
        if (content.length() > 100) {
            return content.substring(0, 100) + "...";
        }
        return content;
    }
}
