package com.hari.creations.moviecatalogservice.model;

public class MovieRating {

	Integer movieId;
	Double movieRating;
	
	public MovieRating(Integer movieId, Double movieRating) {
		super();
		this.movieId = movieId;
		this.movieRating = movieRating;
	}

	public MovieRating() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public Double getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(Double movieRating) {
		this.movieRating = movieRating;
	}

	@Override
	public String toString() {
		return "MovieRating [movieId=" + movieId + ", movieRating=" + movieRating + "]";
	}		
}
