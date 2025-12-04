package com.hcbxwy.blog;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.model.ClassAnnotationAttributes;
import com.hcbxwy.blog.common.base.BaseEntity;

import java.nio.file.Paths;

/**
 * 代码生成器
 *
 * @author hcb
 * @since 2025/11/28 16:17
 */
public class CodeGenerator {
    private static final String URL = "jdbc:mysql://localhost:3306/blog";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String AUTHOR = "hcb";
    private static final String PARENT = "com.hcbxwy.blog";

    public static void main(String[] args) {
        FastAutoGenerator.create(URL, USERNAME, PASSWORD)
                .globalConfig(builder -> builder
                        .author(AUTHOR)
                        .outputDir(Paths.get(System.getProperty("user.dir")) + "/backend/src/main/java")
                        .disableOpenDir()
                        .commentDate("yyyy-MM-dd HH:mm")
                )
                .packageConfig(builder -> builder
                        .parent(PARENT)
                )
                .strategyConfig((scanner, builder) ->builder.
                        addInclude(scanner.apply("请输入表名"))
                        .addTablePrefix("t_")
                        .entityBuilder()
                        .superClass(BaseEntity.class)
                        .enableLombok(new ClassAnnotationAttributes("@Data", "lombok.Data"))
                        .disableSerialVersionUID()
                        .addSuperEntityColumns("id", "create_time", "update_time")
                        .mapperBuilder()
                        // 不生成xml文件
                        .disableMapperXml()
                        .serviceBuilder()
                        .formatServiceFileName("%sService")
                        .formatServiceImplFileName("%sServiceImpl")
                        .controllerBuilder()
//                        .formatFileName("%sController")
                        .enableRestStyle()
                )
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }

}
