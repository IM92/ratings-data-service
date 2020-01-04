package com.milanovic.ratingsdataservice.controller;

import com.milanovic.ratingsdataservice.model.Rating;
import com.milanovic.ratingsdataservice.model.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ivanmilanovic on 12/24/19, 2019
 */
@RestController
@RequestMapping("/ratingsdata")
public class RatingsController {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
        return new Rating(movieId,4);
    }
//this is not the best way to work i
    @RequestMapping("users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId){
        List<Rating> ratings = Arrays.asList(
                new Rating("1234", 5),
                new Rating("1243", 3)
        );
        UserRating userRating = new UserRating();
        userRating.setUserRating(ratings);
        return userRating;
    }
}
