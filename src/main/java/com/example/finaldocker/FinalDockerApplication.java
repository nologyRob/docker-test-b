package com.example.finaldocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FinalDockerApplication {
	@GetMapping("/hello")
	public String getGreeting() {
		return "Hello World";
	}

	public static void main(String[] args) {
		SpringApplication.run(FinalDockerApplication.class, args);
	}

}
