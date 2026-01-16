package com.tm.task_manager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

  @Bean
  public OpenAPI custOpenAPI() {
    return new OpenAPI()
        .info(new Info()
            .title("Task Manager API")
            .version("1.0")
            .description("API documentation for Task Manager application")
            .contact(new Contact()
                .name("Meet Rami")
                .email("meetrami905@gmail.com")));
  }
}
