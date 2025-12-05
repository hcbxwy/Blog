CREATE TABLE t_article
(
    `id`           BIGINT       NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `user_id`      BIGINT       NOT NULL COMMENT '作者ID',
    `title`        VARCHAR(255) NOT NULL COMMENT '标题',
    `slug`         VARCHAR(100) NOT NULL COMMENT 'URL 友好标识',
    `content`      LONGTEXT     NOT NULL COMMENT 'Markdown 原文',
    `summary`      VARCHAR(255) COMMENT '摘要',
    `status`       TINYINT      NOT NULL DEFAULT 0 COMMENT '状态;0-草稿，1-发布',
    `publish_time` DATETIME COMMENT '发布时间',
    `create_time`  DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time`  DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`)
) COMMENT '文章表';

CREATE INDEX `idx_user_id` ON t_article (`user_id`);
CREATE UNIQUE INDEX `uk_slug` ON t_article (`slug`);

CREATE TABLE t_user
(
    `id`            BIGINT       NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `username`      VARCHAR(50)  NOT NULL COMMENT '用户名;登录用',
    `password_hash` VARCHAR(255) NOT NULL COMMENT '密码;加密后',
    `nickname`      VARCHAR(50)  NOT NULL COMMENT '昵称',
    `create_time`   DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time`   DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`)
) COMMENT '用户表';

CREATE UNIQUE INDEX `uk_username` ON t_user (`username`);
