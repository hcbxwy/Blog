package com.hcbxwy.blog.service.impl;

import com.hcbxwy.blog.entity.Article;
import com.hcbxwy.blog.mapper.ArticleMapper;
import com.hcbxwy.blog.service.ArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 文章表 服务实现类
 *
 * @author hcb
 * @since 2025-12-04 14:10
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

}
