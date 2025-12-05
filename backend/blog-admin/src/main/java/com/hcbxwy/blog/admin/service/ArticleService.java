package com.hcbxwy.blog.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hcbxwy.blog.admin.pojo.cmd.ArticleSaveCmd;
import com.hcbxwy.blog.admin.pojo.vo.ArticleVO;
import com.hcbxwy.blog.core.entity.Article;

/**
 * 文章表 服务类
 *
 * @author hcb
 * @since 2025-12-04 14:10
 */
public interface ArticleService extends IService<Article> {

    /**
     * 新增文章
     *
     * @param cmd
     * @author hcb
     * @since 2025/12/4 15:48
     */
    void save(ArticleSaveCmd cmd);

    /**
     * 获取文章详情
     *
     * @param id 文章ID
     * @return com.hcbxwy.blog.pojo.vo.AdminArticleVO
     * @author hcb
     * @since 2025/12/5 15:47
     */
    ArticleVO getAdminArticle(Long id);
}
