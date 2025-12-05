package com.hcbxwy.blog.modules.admin.pojo.cmd;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

/**
 * 新增文章参数
 *
 * @author hcb
 * @since 2025-12-04 14:10
 */
@Data
public class ArticleSaveCmd {

    /**
     * 标题
     */
    @NotBlank(message = "文章标题必填")
    @Size(max = 255, message = "文章标题长度不能超过255个字符")
    private String title;

    /**
     * 文章内容（Markdown 原文）
     */
    @NotBlank(message = "文章内容必填")
    private String content;

    /**
     * URL 友好标识
     */
    @NotBlank(message = "URL 友好标识必填")
    @Size(max = 255, message = "URL 友好标识长度不能超过255个字符")
    private String slug;
}
