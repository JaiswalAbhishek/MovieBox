package com.rating.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rating.model.Rating;
import com.rating.model.UserRating;

@RestController
@RequestMapping("/rating")
public class RatingController {

	@GetMapping("/{movieID}")
	public Rating getrating(@PathVariable("movieID") String movieID) {
		return new Rating(movieID,new Random().nextInt(5) );
	}

	@GetMapping("users/{userID}")
	public UserRating getUserRatings(@PathVariable("userID") String userID) {
		List<Rating> ratingList =Arrays.asList(
				new Rating("RHTDM", new Random().nextInt(5)),
				new Rating("DDLJ", new Random().nextInt(5)),
				new Rating("CARGILL", new Random().nextInt(5))					
				);
		UserRating userRating = new UserRating();
		userRating.setUserRatings(ratingList);
		return userRating;
	}
	
}

//List<Rating> ratingList =Arrays.asList(
//new Rating("RHTDM", new Random().nextInt(5)),
//new Rating("DDLJ", new Random().nextInt(5)),
//new Rating("CARGILL", new Random().nextInt(5))					
//);

