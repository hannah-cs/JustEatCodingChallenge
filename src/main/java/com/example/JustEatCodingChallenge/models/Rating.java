package com.example.JustEatCodingChallenge.models;

public class Rating {
    private int count;
    private Double starRating;
    private Double userRating;

    public Rating() {
    }

    public Rating(int count, Double starRating, Double userRating) {
        this.count = count;
        this.starRating = starRating;
        this.userRating = userRating;
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

    public Double getUserRating() {
        return userRating;
    }

    public void setUserRating(Double userRating) {
        this.userRating = userRating;
    }
}
