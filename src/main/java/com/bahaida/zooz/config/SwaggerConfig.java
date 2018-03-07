package com.bahaida.zooz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

import static springfox.documentation.builders.PathSelectors.regex;

/**
 *
 * <b>SwaggerConfig is the class that manages the Swagger Documentaion configuration</b>
 *
 * <p>more details on <strong><i>{servername}/swagger-ui.html</i></strong></p>
 *
 * @author Brahim Bahaida
 *
 * @version 1.0
 *
 * @since 2018-03-07
 */


@EnableSwagger2
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket productApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.bahaida.zooz"))
                .paths(regex("/api.*"))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "ZooZ REST API",
                "Cette application cible exclusivement les des bains maures et particulièrement les bains maures femmes Mayorka. La cible est technophile, elle utilise son mobile plus d’une heure par jour, veut s’auto-examiner les seins, et se représente principalement les femmes.",
                "API 1.0",
                "Terms of service",
                new Contact("Brahim Bahaida", "https://www.linkedin.com/in/bbahaida/", "bbahieda@outlook.com"),
                "MIT License", "https://opensource.org/licenses/MIT");
    }
}
