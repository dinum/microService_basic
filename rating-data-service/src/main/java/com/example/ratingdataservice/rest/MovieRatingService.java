package com.example.ratingdataservice.rest;

import com.example.ratingdataservice.response.RatingResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
@RequestMapping("movie")
public class MovieRatingService {

    @RequestMapping("/rating/{movieId}")
    public RatingResponse getRating(@PathVariable("movieId") String movieId){
        int rating =0;

        switch (movieId){
            case "1":
                rating=5;
                break;
            case "2":
                rating=1;
                break;
            case "3":
                rating=2;
                break;
            case "4":
                rating=9;
                break;
            case "5":
                rating=3;
                break;
            case "6":
                rating=7;
                break;
            default:
                rating=1;
                break;
        }



        return new RatingResponse(5,rating);
    }

}
