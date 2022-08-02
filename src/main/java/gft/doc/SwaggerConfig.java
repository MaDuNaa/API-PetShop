package gft.doc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.Contact;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	private ApiKey apiKey() { 
	    return new ApiKey("JWT", "Authorization", "header"); 
	}
	
	private SecurityContext securityContext() { 
	    return SecurityContext.builder().securityReferences(defaultAuth()).build(); 
	} 

	private List<SecurityReference> defaultAuth() { 
	    AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything"); 
	    AuthorizationScope[] authorizationScopes = new AuthorizationScope[1]; 
	    authorizationScopes[0] = authorizationScope; 
	    return Arrays.asList(new SecurityReference("JWT", authorizationScopes)); 
	}



	private Contact contato() {
		return new Contact(
				"Matheus Nascimento",
				"http://www.apidogs.com.br",
				"mott@gft.com");
	}
	
	
	private ApiInfoBuilder informacoesApi() {
		
		ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
		
	  apiInfoBuilder.title("Api - Pet Shop");
	  apiInfoBuilder.description("SISTEMA DE ATENDIMENTO VETERINÁRIO");
	  apiInfoBuilder.version("1.0");
	  apiInfoBuilder.termsOfServiceUrl("Termo de uso: Open Source");
	  apiInfoBuilder.license("Licença - Matheus Nascimento");
	  apiInfoBuilder.licenseUrl("http://www.seusite.com.br");
	  apiInfoBuilder.contact(this.contato());
	  
	  return apiInfoBuilder;
		
	}
	
	@Bean
	public Docket detalheApi() {
		Docket docket = new Docket(DocumentationType.SWAGGER_2);
		
		docket
		.select()
		.apis(RequestHandlerSelectors.basePackage("gft.controller"))
		.paths(PathSelectors.any())
		.build()
		.securityContexts(Arrays.asList(securityContext()))
		.securitySchemes(Arrays.asList(apiKey()))
		.apiInfo(this.informacoesApi().build())
		.consumes(new HashSet<String>(Arrays.asList("application/json")))
		.produces(new HashSet<String>(Arrays.asList("application/json")));
		
		return docket;
	}
}
