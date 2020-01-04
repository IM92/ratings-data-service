package com.milanovic.ratingsdataservice.model;

import java.util.List;

/**
 * Created by ivanmilanovic on 1/3/20, 2020
 */
public class UserRating {

    private List<Rating> userRating;

    public List<Rating> getUserRating() {
        return userRating;
    }

    public void setUserRating(List<Rating> userRating) {
        this.userRating = userRating;
    }
}
