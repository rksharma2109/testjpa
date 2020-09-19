package testjpa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@SpringBootApplication(scanBasePackages="testjpa")
@EnableJpaRepositories(basePackages={"testjpa"})

public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Bean
	public OpenAPI springShopOpenAPI() {
		return new OpenAPI().info(new Info().title("").description("RTO API").version("1.0.0")

				.license(new License().name("").url("")))
				.externalDocs(new ExternalDocumentation().description("").url(""));
	}

}
