package com.microservices.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info=@Info(
				title="Account microservices REST API Documentation",
				description = "Eazy Bank Accounts microservices",
				version = "v1",
				contact = @Contact(
						name="Prashant Malhotra",
						email="prashantmalhotra462@gmail.com"
				),
				license = @License(
						name="Apache2.0"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Documentation for Eazy Bank",
				url="https://github.com/prashant462/microservices-java/blob/main/README.md"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
