package com.hcbxwy.blog.core.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hcbxwy.blog.core.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * 文章表
 *
 * @author hcb
 * @since 2025-12-04 14:10
 */
@Data
@TableName("t_article")
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
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
