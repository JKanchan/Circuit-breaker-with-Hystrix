package com.learning.moviecatalog.model;

public class Rating {

    private int movieId;
    private int rating;

    public Rating() {
    	
    }
    public Rating(int movieId, int rating) {
        this.movieId = movieId;
        this.rating = rating;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
