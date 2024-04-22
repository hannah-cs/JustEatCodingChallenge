package com.example.JustEatCodingChallenge;

import com.example.JustEatCodingChallenge.UI.UserInterface;
import com.example.JustEatCodingChallenge.service.APIService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class JustEatCodingChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(JustEatCodingChallengeApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	public CommandLineRunner run(APIService apiService, UserInterface userInterface) {
		return args -> {
			userInterface.run();
		};
	}
}
