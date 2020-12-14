package com.example.aleloprojeto.cadcliente.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig {


    private static final String BASE_PACKAGE = "com.example.aleloprojeto.cadcliente";
    private static final String API_TITLE = "Consulting Companies";
    private static final String API_DESCRIPTION = "Consulting Companies API Rest";
    private static final String API_VERSION = "1.0.0";
    private static final String CONTACT_NAME = "Alessander D. F. Junior";
    private static final String CONTACT_URL = "https://github.com/Alessanderjunior";
    private static final String CONTACT_EMAIL = "alessanderjr.dev@gmail.com";


    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(buildApiInfo());

    }

    private ApiInfo buildApiInfo() {
        return new ApiInfoBuilder()
                .title(API_TITLE)
                .description(API_DESCRIPTION)
                .version(API_VERSION)
                .contact(new Contact(CONTACT_NAME, CONTACT_URL, CONTACT_EMAIL))
                .build();
    }



}
