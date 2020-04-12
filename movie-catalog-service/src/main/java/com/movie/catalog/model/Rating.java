package com.movie.catalog.model;

public class Rating {

	private String movieID;
	private int movieRating;
	public Rating() {
		super();
	}
	public Rating(String movieID, int movieRating) {
		super();
		this.movieID = movieID;
		this.movieRating = movieRating;
	}
	public String getMovieID() {
		return movieID;
	}
	public void setMovieID(String movieID) {
		this.movieID = movieID;
	}
	public int getMovieRating() {
		return movieRating;
	}
	public void setMovieRating(int movieRating) {
		this.movieRating = movieRating;
	}
	@Override
	public String toString() {
		return "Rating [movieID=" + movieID + ", movieRating=" + movieRating + "]";
	}
	
	
}
