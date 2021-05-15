package co.edu.umanizales.grafociudadesapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket apiPaseoPerrosDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Grafo Ciudades")
                .select()
                .apis(RequestHandlerSelectors.basePackage(
                        "co.edu.umanizales.grafociudadesapi.controller"))
                .paths(PathSelectors.any()).build()
                .apiInfo(getApiInfo());
    }
    //Agregar método información o documentación de mi api
    private ApiInfo getApiInfo() {
        return new ApiInfo(
                "API Grafo Ciudades ",
                "Api que permite gestionar el Grafo de Ciudades",
                "1.0",
                "http://www.umanizales.com/",
                new Contact("Carlos Loaiza", "http://www.umanizales.edu.co/",
                        "carloaiza@umanizales.edu.co"),
                "LICENSE",
                "LICENSE URL",
                Collections.emptyList()
        );
    }
}
