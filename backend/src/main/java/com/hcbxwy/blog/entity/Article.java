package com.hcbxwy.blog.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hcbxwy.blog.common.base.BaseEntity;
import lombok.Data;

import java.time.LocalDateTime;
import lombok.EqualsAndHashCode;

/**
 * 文章表
 *
 * @author hcb
 * @since 2025-12-04 14:10
 */
@Data
@TableName("t_article")
@EqualsAndHashCode(callSuper = true)
public class Article extends BaseEntity {

    /**
     * 作者ID
     */
    private Long userId;

    /**
     * 标题
     */
    private String title;

    /**
     * URL 友好标识
     */
    private String slug;

    /**
     * Markdown 原文
     */
    private String content;

    /**
     * 摘要
     */
    private String summary;

    /**
     * 状态;0-草稿，1-发布
     */
    private Byte status;

    /**
     * 发布时间
     */
    private LocalDateTime publishTime;
}
