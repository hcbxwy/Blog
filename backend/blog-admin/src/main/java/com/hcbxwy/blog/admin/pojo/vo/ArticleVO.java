package com.hcbxwy.blog.admin.pojo.vo;

import lombok.Data;

/**
 * 后台文章VO
 *
 * @author hcb
 * @since 2025/12/5 15:44
 */
@Data
public class ArticleVO {

    /**
     * 标题
     */
    private String title;

    /**
     * 文章内容（Markdown 原文）
     */
    private String content;

    /**
     * URL 友好标识
     */
    private String slug;
}
