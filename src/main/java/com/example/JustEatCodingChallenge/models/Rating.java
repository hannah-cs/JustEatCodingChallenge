package com.example.JustEatCodingChallenge.models;

public class Rating {
    private int count;
    private Double starRating;
    private Double userRating;
    private double ratingAsNumber;

    public Rating() {
    }

    public Rating(int count, Double starRating, Double userRating) {
        this.count = count;
        this.starRating = starRating;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Double getStarRating() {
        return starRating;
    }

    public void setStarRating(Double starRating) {
        this.starRating = starRating;
    }

}
