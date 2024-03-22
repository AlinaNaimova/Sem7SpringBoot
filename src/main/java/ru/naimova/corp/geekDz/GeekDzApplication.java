package ru.naimova.corp.geekDz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
public class GeekDzApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeekDzApplication.class, args);
	}

}
