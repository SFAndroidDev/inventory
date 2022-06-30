package com.sfdevs.inventory.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.security.SecurityScheme.Type;

@Configuration
public class OpenApiConfig {
//
//	private static final String BEARER_FORMAT_JWT = "JWT";
//	private static final String SCHEME_BEARER = "bearer";
//	private static final String SECURITY_SCHEME_NAME_BEARER_AUTH = "bearerAuth";

	@Bean
	  public OpenAPI inventoryOpenAPI() {
	      return new OpenAPI()
//	    		  .addSecurityItem(new SecurityRequirement().addList(SECURITY_SCHEME_NAME_BEARER_AUTH))
//	    		  .components(
//	    				  new Components()
//	    				  .addSecuritySchemes(SECURITY_SCHEME_NAME_BEARER_AUTH, 
//	    						  new SecurityScheme()
//	    						  .name(SECURITY_SCHEME_NAME_BEARER_AUTH)
//	    						  .type(Type.HTTP)
//	    						  .scheme(SCHEME_BEARER)
//	    						  .bearerFormat(BEARER_FORMAT_JWT)
//	    						  )
//	    				  )
	              .info(new Info()
	            		  .title("Inventory API")
	            		  .description("Manage your own objects collections")
	            		  .version("0.0.1-SNAPSHOT"));

	  }
}
