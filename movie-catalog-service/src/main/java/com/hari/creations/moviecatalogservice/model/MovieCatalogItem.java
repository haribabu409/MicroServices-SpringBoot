package com.hari.creations.moviecatalogservice.model;

public class MovieCatalogItem {

	private String name;
	private String desc;
	private Integer movieid;
	private Double movieRating;
	public MovieCatalogItem(String name, String desc, Integer movieid, Double movieRating) {
		super();
		this.name = name;
		this.desc = desc;
		this.movieid = movieid;
		this.movieRating = movieRating;
	}
	public MovieCatalogItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Integer getMovieid() {
		return movieid;
	}
	public void setMovieid(Integer movieid) {
		this.movieid = movieid;
	}
	public Double getMovieRating() {
		return movieRating;
	}
	public void setMovieRating(Double movieRating) {
		this.movieRating = movieRating;
	}
	@Override
	public String toString() {
		return "MovieCatalogItem [name=" + name + ", desc=" + desc + ", movieid=" + movieid + ", movieRating="
				+ movieRating + "]";
	}	
}
