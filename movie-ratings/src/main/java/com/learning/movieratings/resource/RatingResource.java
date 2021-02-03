package com.learning.movieratings.resource;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.movieratings.model.Rating;
import com.learning.movieratings.model.UserRating;

@RestController
@RequestMapping("/ratings")
public class RatingResource {
	 
	 
	 @RequestMapping("/movies/{movieId}")
	    public Rating getMovieRating(@PathVariable("movieId") int movieId) {
	        return new Rating(movieId, 4);
	    }

	    @RequestMapping("/user/{userId}")
	    public UserRating getUserRatings(@PathVariable("userId") int userId) {
	        UserRating userRating = new UserRating();
	        userRating.initData(userId);
	        return userRating;

	    }

	
	

}
