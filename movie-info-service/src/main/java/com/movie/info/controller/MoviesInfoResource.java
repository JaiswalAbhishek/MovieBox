package com.movie.info.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.info.model.Movie;

@RestController
@RequestMapping("/info")
public class MoviesInfoResource {

	@GetMapping("/{movieID}")
	public Movie getMovieInfo(@PathVariable("movieID") String movieID) {
		return new Movie(movieID,"name");
	}
}
