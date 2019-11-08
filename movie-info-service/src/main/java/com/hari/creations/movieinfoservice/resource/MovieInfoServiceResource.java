package com.hari.creations.movieinfoservice.resource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hari.creations.movieinfoservice.model.Movie;

@RestController
@RequestMapping("/movies")
public class MovieInfoServiceResource {
	
	private static HashMap<Integer,Movie> movies;
	
	static
	{
		movies = new HashMap<Integer, Movie>();
		Integer[] nos = {1,2,3,4,5,6,7,8,9,10};
		for(int i=0; i<=20; i++)
		{
			movies.put(i,new Movie("name"+i, "description"+i, i));
			//System.out.println("created movie record: "+ i + "got created");
		}
	}
	
	@RequestMapping("/all")
	public Collection<Movie> getMovies()
	{
		return  movies.values();	
	}
	
	@RequestMapping("/{movieId}")
	public Movie getMoviebyId(@PathVariable("movieId") Integer movieId)
	{
		//System.out.println("searching for movie with id: " + movieId );
		return movies.get(movieId);
	}

}
