package com.zzy.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
    @Autowired
    private ModelConfig modelConfig;
    @Value("${swagger.enable}")
    private boolean enable;
    @Value("${swagger.pathMapping}")
    private String pathMapping;
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.OAS_30)
                .enable(enable)
                .apiInfo(apiInfo())
                // 设置哪些接口暴露给swagger展示
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                // 扫描所有 .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                // 设置安全模型，设置token
//                .securitySchemes(securitySchemes())
//                .securityContexts(securityContexts())
                .build()
                .pathMapping(pathMapping);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("标题：model后台系统_接口文档")
                .description("供开发人员阅读、测试使用。")
                .contact(new Contact(modelConfig.getName(),  "https://zzygeo.cn", "zzy_geo@163.com"))
                .version("版本号:" + modelConfig.getVersion())
                .build();
    }
}
