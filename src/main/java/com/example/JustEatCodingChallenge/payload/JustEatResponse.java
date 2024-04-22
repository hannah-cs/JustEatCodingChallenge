package com.example.JustEatCodingChallenge.payload;

import com.example.JustEatCodingChallenge.models.Restaurant;

import java.util.List;

public class JustEatResponse {
    private List<Restaurant> restaurants;

    public JustEatResponse() {
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }
}
