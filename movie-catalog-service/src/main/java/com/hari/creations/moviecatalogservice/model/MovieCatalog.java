package com.hari.creations.moviecatalogservice.model;

import java.util.ArrayList;
import java.util.List;

public class MovieCatalog {
	
	private Integer userId;
	private List<MovieCatalogItem> items = new ArrayList<MovieCatalogItem>();
	public MovieCatalog(Integer userId, List<MovieCatalogItem> items) {
		super();
		this.userId = userId;
		this.items = items;
	}
	public MovieCatalog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public List<MovieCatalogItem> getItems() {
		return items;
	}
	public void setItems(List<MovieCatalogItem> items) {
		this.items = items;
	}
	
	
}
