package com.example.JustEatCodingChallenge.UI;

import com.example.JustEatCodingChallenge.models.Restaurant;
import com.example.JustEatCodingChallenge.service.APIService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
public class UserInterface {
    private final Scanner scanner;
    private final APIService apiService;

    public UserInterface(APIService apiService) {
        this.apiService = apiService;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
            boolean exit = false;
            while (!exit) {
                System.out.println("Enter a postcode to find restaurants (or type 'exit' to quit):");
                String input = scanner.nextLine().trim();
                if (input.equalsIgnoreCase("exit")) {
                    exit = true;
                } else {
                    List<Restaurant> restaurants = apiService.fetchData(input);
                    if (restaurants.isEmpty()) {
                        System.out.println("No restaurants found for the given postcode.");
                    } else {
                        System.out.println("Top 10 restaurants in " + input + ":");
                        for (int i = 0; i < Math.min(10, restaurants.size()); i++) {
                            Restaurant restaurant = restaurants.get(i);
                            System.out.println((i + 1) + ". " + restaurant.getName() + ", " + restaurant.getAddress().toString() + ". Rating: " + restaurant.getRating().getStarRating() + ". Cuisines: " + restaurant.getCuisines().toString());
                        }
                    }
                }
            }
            scanner.close();
            System.exit(0);
        };
}