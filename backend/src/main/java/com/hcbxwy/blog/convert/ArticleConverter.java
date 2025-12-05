package com.hcbxwy.blog.convert;

import com.hcbxwy.blog.modules.admin.pojo.cmd.ArticleSaveCmd;
import com.hcbxwy.blog.modules.admin.pojo.vo.ArticleVO;
import com.hcbxwy.blog.modules.common.entity.Article;
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
