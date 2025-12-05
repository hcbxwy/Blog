package com.hcbxwy.blog.modules.admin.controller;

import com.hcbxwy.blog.modules.admin.pojo.cmd.ArticleSaveCmd;
import com.hcbxwy.blog.modules.admin.pojo.vo.ArticleVO;
import com.hcbxwy.blog.modules.admin.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * 文章管理
 *
 * @author hcb
 * @since 2025-12-04 14:10
 */
@RestController
@RequestMapping("/admin/article")
@RequiredArgsConstructor
public class ArticleController {

    private final ArticleService articleService;

    /**
     * 新增文章
     *
     * @param cmd
     * @author hcb
     * @since 2025/12/4 15:41
     */
    @PostMapping("/")
    public void save(@RequestBody ArticleSaveCmd cmd) {
        articleService.save(cmd);
    }

    /**
     * 获取文章详情
     *
     * @param id 文章ID
     * @return com.hcbxwy.blog.pojo.vo.AdminArticleVO
     * @author hcb
     * @since 2025/12/5 15:46
     */
    @GetMapping("/{id}")
    public ArticleVO getAdminArticle(@PathVariable Long id) {
        return articleService.getAdminArticle(id);
    }


}
