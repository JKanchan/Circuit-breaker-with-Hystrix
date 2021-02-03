package com.learning.movieratings.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Rating {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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
