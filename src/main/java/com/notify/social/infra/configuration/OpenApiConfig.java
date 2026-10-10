package com.notify.social.infra.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI notifySocialOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Notify Social API")
                        .description("API para disparo de notificações de redes sociais.")
                        .version("v1")
                        .contact(new Contact()
                                .name("Notify Social")));
    }
}
