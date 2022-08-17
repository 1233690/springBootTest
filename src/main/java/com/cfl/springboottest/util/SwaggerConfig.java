package com.cfl.springboottest.util;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


/**
 * @author cfl
 * @date 2022/8/16 20:28
 */
@Configuration
@EnableOpenApi
//@EnableSwaggerBootstrapUI
public class SwaggerConfig {


    /**
     * 是否开启swagger配置，生产环境需关闭
     */
    /*    @Value("${swagger.enabled}")*/
//    private boolean enable;

    /**
     * 创建API
     * http:IP:端口号/swagger-ui/index.html 原生地址
     * http:IP:端口号/doc.html bootStrap-UI地址
     */
    @Bean
    public Docket desertsApi(){
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                //是否启用Swagger
                .enable(true)
                .select()
                //基于包进行扫描
                //RequestHandlerSelectors.basePackage()//基于包进行扫描
//                 .apis(RequestHandlerSelectors.any())//扫描全部
                //RequestHandlerSelectors.none()//不扫描
//                .apis(RequestHandlerSelectors.basePackage("com.cfl.springboottest.controller"))
                // 扫描所有有注解的api，用这种方式更灵活
               .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build()
                //多人开发时分组
                .groupName("default");
    }

    // 配置Swagger信息 apiInfo
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("API说明文档")
                .description("API说明文档")
                .contact(new Contact("福林", "https://github.com/1233690", "1233690@qq.com"))
                .termsOfServiceUrl("https://www.zybuluo.com/mdeditor#2281023-full-reader")
                .version("1.0")
                .build();
    }

}
