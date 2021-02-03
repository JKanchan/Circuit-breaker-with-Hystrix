package com.learning.movieratings.model;

import java.util.List;
import java.util.Arrays;

public class UserRating {

    private int userId;
    private List<Rating> ratings;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
   

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }
    public void initData(int userId) {
        this.setUserId(userId);
        this.setRatings(Arrays.asList(
                new Rating(500, 3),
                new Rating(501, 4)
        ));
    }

}
