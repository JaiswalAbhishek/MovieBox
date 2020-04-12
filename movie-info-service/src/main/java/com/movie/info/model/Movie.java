package com.movie.info.model;

public class Movie {

	private String movieID;
	private String movieName;
	public Movie() {
		super();
	}
	public Movie(String movieID, String movieName) {
		super();
		this.movieID = movieID;
		this.movieName = movieName;
	}
	public String getMovieID() {
		return movieID;
	}
	public void setMovieID(String movieID) {
		this.movieID = movieID;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	@Override
	public String toString() {
		return "Movie [movieID=" + movieID + ", movieName=" + movieName + "]";
	}
	
}
