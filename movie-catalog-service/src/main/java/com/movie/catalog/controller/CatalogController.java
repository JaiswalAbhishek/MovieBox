package com.movie.catalog.controller;

import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.movie.catalog.model.CatalogItem;
import com.movie.catalog.model.Movie;
import com.movie.catalog.model.Rating;
import com.movie.catalog.model.UserRating;

@RestController
@RequestMapping("/catalog")
public class CatalogController<R> {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private WebClient.Builder webClientBuilder;
	
	
	@GetMapping("/{userID}")
	public List<CatalogItem> getAllCatalogItem(@PathVariable("userID") String userID){
		UserRating ratingList = restTemplate.getForObject("http://rating-data-service/rating/users/"+userID,UserRating.class);
		return ratingList.getUserRatings().stream().map(rating -> {
									Movie movie = restTemplate.getForObject("http://movie-info-service/info/"+rating.getMovieID(), Movie.class);
									return new CatalogItem(movie.getMovieID(), movie.getMovieName(),rating.getMovieRating());
							})
							.collect(Collectors.toList());
	}
}
//Movie movie = webClientBuilder.build()
//.get()
//.uri("http://localhost:8082/info/"+rating.getMovieID())
//.retrieve()
//.bodyToMono(Movie.class)
//.block();

