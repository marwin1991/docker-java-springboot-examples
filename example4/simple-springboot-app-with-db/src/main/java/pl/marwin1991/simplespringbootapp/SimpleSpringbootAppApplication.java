package pl.marwin1991.simplespringbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class SimpleSpringbootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringbootAppApplication.class, args);
	}

}
