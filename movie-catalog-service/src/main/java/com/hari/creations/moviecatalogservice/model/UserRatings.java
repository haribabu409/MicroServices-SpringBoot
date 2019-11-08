package com.hari.creations.moviecatalogservice.model;

import java.util.ArrayList;
import java.util.List;

public class UserRatings {

	private Integer userID;
	List<MovieRating> movieRatings = new ArrayList<MovieRating>();
	
	public UserRatings(Integer userID, List<MovieRating> movieRatings) {
		super();
		this.userID = userID;
		this.movieRatings = movieRatings;
	}
	public UserRatings() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public List<MovieRating> getMovieRatings() {
		return movieRatings;
	}
	public void setMovieRatings(List<MovieRating> movieRatings) {
		this.movieRatings = movieRatings;
	}
	
	@Override
	public String toString() {
		return "UserRatings [userID=" + userID + ", movieRatings=" + movieRatings + "]";
	}	
}
