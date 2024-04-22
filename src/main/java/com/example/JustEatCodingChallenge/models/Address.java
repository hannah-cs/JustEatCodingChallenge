package com.example.JustEatCodingChallenge.models;

import java.util.List;

public class Address {
    private String city;
    private String firstLine;
    private String postalCode;
    private List<Double> coordinates;

    public Address() {
    }

    public Address(String city, String firstLine, String postalCode, List<Double> coordinates) {
        this.city = city;
        this.firstLine = firstLine;
        this.postalCode = postalCode;
        this.coordinates = coordinates;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFirstLine() {
        return firstLine;
    }

    public void setFirstLine(String firstLine) {
        this.firstLine = firstLine;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public List<Double> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Double> coordinates) {
        this.coordinates = coordinates;
    }
}
