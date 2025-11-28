package com.hcbxwy.blog.service.impl;

import com.hcbxwy.blog.entity.User;
import com.hcbxwy.blog.mapper.UserMapper;
import com.hcbxwy.blog.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 用户表 服务实现类
 *
 * @author hcb
 * @since 2025-11-28 17:20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
