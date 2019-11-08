package com.hari.creations.moviecatalogservice.model;

public class Movie {

	private String name;
	private String desc;
	private Integer movieid;
	
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	public Movie(String name, String desc, Integer movieid) {
		super();
		this.name = name;
		this.desc = desc;
		this.movieid = movieid;
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

	@Override
	public String toString() {
		return "Movie [name=" + name + ", desc=" + desc + ", movieid=" + movieid + "]";
	}
	
	
}
