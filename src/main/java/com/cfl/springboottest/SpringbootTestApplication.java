package com.cfl.springboottest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@ComponentScan(basePackages = {"com.example.springboottest.service"})

@SpringBootApplication
@MapperScan(value = "com.cfl.springboottest.mapper")
@EnableOpenApi  //开启Swagger
public class SpringbootTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTestApplication.class, args);
    }

}
