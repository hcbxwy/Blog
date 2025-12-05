package com.hcbxwy.blog.admin.convert;

import com.hcbxwy.blog.admin.pojo.cmd.ArticleSaveCmd;
import com.hcbxwy.blog.admin.pojo.vo.ArticleVO;
import com.hcbxwy.blog.core.entity.Article;
import org.mapstruct.Mapper;

/**
 * 文章对象转换器
 *
 * @author hcb
 * @since 2025/12/4 16:12
 */
@Mapper(componentModel = "spring") // 使用构造函数注入
public interface ArticleConverter {

    Article toEntity(ArticleSaveCmd articleSaveCmd);

    ArticleVO toVO(Article article);
}
