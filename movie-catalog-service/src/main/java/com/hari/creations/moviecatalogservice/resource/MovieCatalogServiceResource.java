package com.hari.creations.moviecatalogservice.resource;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hari.creations.moviecatalogservice.model.Movie;
import com.hari.creations.moviecatalogservice.model.MovieCatalog;
import com.hari.creations.moviecatalogservice.model.MovieCatalogItem;
import com.hari.creations.moviecatalogservice.model.UserRatings;

@RestController
@RequestMapping(value = "/catalog", method = RequestMethod.GET)
public class MovieCatalogServiceResource {
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	
	@RequestMapping("/{userId}")
	public MovieCatalog getCatalogForUserId(@PathVariable("userId") Integer userId)
	{
		System.out.println("recieved request on /catalog/userId");
		//for userId, get userRatings
		UserRatings userRatings = restTemplate.getForObject("http://ratings-data-service/ratings/"+userId, UserRatings.class);
		//for each rating,get movie details
		List<MovieCatalogItem> items = userRatings.getMovieRatings()
				.parallelStream()
				.map(k -> {
					Movie movie = restTemplate.getForObject("http://movie-info-service/movies/"+k.getMovieId(), Movie.class);
					return new MovieCatalogItem(movie.getName(), movie.getDesc(), movie.getMovieid(), k.getMovieRating());
				})
				.collect(Collectors.toList());
		MovieCatalog result = new MovieCatalog();
		result.setItems(items);
		result.setUserId(userId);
		return result;		
	}

}
