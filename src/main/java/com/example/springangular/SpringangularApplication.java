package com.example.springangular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringangularApplication extends SpringBootServletInitializer {
	
	
	@GetMapping("/")
	public String greet() {
		return "WELCOME";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringangularApplication.class, args);
	}
	
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringangularApplication.class);
    }
}
