package io.codementor.gtommee.rest_tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class RestTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestTutorialApplication.class, args);
	}

}
