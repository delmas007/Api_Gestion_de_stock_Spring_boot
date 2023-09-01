package com.delmas.gestiondestock.Config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import static com.delmas.gestiondestock.Utils.Contants.APP_ROOT;

@Configuration
//dire c'est une configuration et lancement au demarrage
public class SwaggerConfiguration {

    @Bean // Annotation nécessaire pour que Spring détecte et initialise ce bean
    public Docket api(){
        return  new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(
                        new ApiInfoBuilder()
                                .description("Gestion de stock api documentation")
                                .title("Gestion de stock REST API")
                                .build()
                )
                .groupName("REST API V1")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.delmas.gestiondestock.Controller"))
                .paths(PathSelectors.ant(APP_ROOT+"/**"))
                .build();
    }

}
