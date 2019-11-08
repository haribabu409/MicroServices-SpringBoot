package com.hari.creations.ratingsdataservice.resource;

import java.util.Collection;
import java.util.HashMap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hari.creations.ratingsdataservice.model.MovieRating;
import com.hari.creations.ratingsdataservice.model.UserRatings;

@RestController
@RequestMapping("/ratings")
public class RatingsdataserviceResource {
	private Integer userId;
	private static HashMap<Integer, UserRatings> userRatingsMap;
	
	static
	{
		userRatingsMap = new HashMap<Integer, UserRatings>();
		//10 users in total
		for(int i=1;i<=10; i++)
		{
			UserRatings userRatings = new UserRatings();
			MovieRating mRating;
			//each user, 6ratings
			for(int j=0; j<6; j++)
			{
				mRating = new MovieRating((int)(20*Math.random()), 5*Math.random() );
				userRatings.getMovieRatings().add(mRating);				
			}
			userRatings.setUserID(i);
			userRatingsMap.put(i,userRatings);			
			System.out.println("added " + userRatings + " to user: "+i);
		}
	}

	@RequestMapping(value="/all", method = RequestMethod.GET)
	public Collection<UserRatings> getAllRatings()
	{
		return userRatingsMap.values();
	}
	
	@RequestMapping(value="/{userId}", method = RequestMethod.GET)
	public UserRatings getRatingsByUserId(@PathVariable("userId") Integer userId)
	{
		return userRatingsMap.get(userId);
	}

}
