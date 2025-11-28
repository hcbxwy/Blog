package com.hcbxwy.blog.entity;

import com.hcbxwy.blog.common.BaseEntity;
import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * 用户表
 *
 * @author hcb
 * @since 2025-11-28 17:20
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity {

    /**
     * 用户名（登录用）
     */
    private String username;

    /**
     * 加密后的密码
     */
    private String passwordHash;

    /**
     * 昵称
     */
    private String nickname;
}
