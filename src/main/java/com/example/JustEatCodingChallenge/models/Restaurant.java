package com.example.JustEatCodingChallenge.models;

import java.util.List;

public class Restaurant {
    private String id;
    private String name;
    private List<Cuisine> cuisines;
    private Rating rating;
    private Address address;

    public Restaurant() {
    }

    public Restaurant(String id, String name, List<Cuisine> cuisines, Rating rating, Address address) {
        this.id = id;
        this.name = name;
        this.cuisines = cuisines;
        this.rating = rating;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Cuisine> getCuisines() {
        return cuisines;
    }

    public void setCuisines(List<Cuisine> cuisines) {
        this.cuisines = cuisines;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
