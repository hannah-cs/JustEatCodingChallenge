package com.example.JustEatCodingChallenge.service;

import com.example.JustEatCodingChallenge.models.Restaurant;
import com.example.JustEatCodingChallenge.payload.JustEatResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class APIService {
    private static final String api_url = "https://uk.api.just-eat.io/discovery/uk/restaurants/enriched/bypostcode/";
    private RestTemplate restTemplate;
    public APIService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public List<Restaurant> fetchData(String postcode) {
        String requestUrl = api_url + postcode;
        JustEatResponse response = restTemplate.getForObject(requestUrl, JustEatResponse.class);
        List<Restaurant> first10Restaurants = response.getRestaurants().stream()
                .limit(10)
                .collect(Collectors.toList());

        return first10Restaurants;
    }
}
