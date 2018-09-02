package com.lizp.springmvc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;

@EnableSwagger
public class SwaggerConfig {
    @Autowired
    private SpringSwaggerConfig springSwaggerConfig;

    @Bean
    public SwaggerSpringMvcPlugin customImplementation() {
        return new SwaggerSpringMvcPlugin(this.springSwaggerConfig).apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo("springmvc搭建swagger", "spring-API swagger测试", "My Apps API terms of service",
                "984610159@qq.com", "web app", "My Apps API License URL");
    }
}
