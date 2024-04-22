package com.example.JustEatCodingChallenge;

import com.example.JustEatCodingChallenge.models.Restaurant;
import com.example.JustEatCodingChallenge.service.APIService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Scanner;

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
	public CommandLineRunner run(APIService apiService) {
		return args -> {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a postcode to find restaurants:");
			String postcode = scanner.nextLine().trim();
			List<Restaurant> restaurants = apiService.fetchData(postcode);
			if (restaurants.isEmpty()) {
				System.out.println("No restaurants found for the given postcode.");
			} else {
				System.out.println("Top 10 restaurants in " + postcode + ":");
				for (int i = 0; i < Math.min(10, restaurants.size()); i++) {
					Restaurant restaurant = restaurants.get(i);
					System.out.println((i + 1) + ". " + restaurant.getName() + ", " + restaurant.getAddress().toString() + ". Rating: " + restaurant.getRating().getStarRating() + ". Cuisines: " + restaurant.getCuisines().toString());
				}
			}
			scanner.close();
		};
	}


}
