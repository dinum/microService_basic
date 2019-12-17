package com.example.moviecatelogservice.rest;
import com.example.moviecatelogservice.request.Movie;
import com.example.moviecatelogservice.request.Movie2;
import com.example.moviecatelogservice.request.MovieListResponse;
import com.example.moviecatelogservice.response.MovieCatelogResponse;
import com.example.moviecatelogservice.response.RatingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/movies")
public class MovieCatelogService {

    @Autowired
    private WebClient.Builder webClientBuilder;

    @RequestMapping("/getAll")
    public MovieCatelogResponse getMovieRatings(){

        MovieListResponse movieList = webClientBuilder.build()
                .get()
                .uri("http://localhost:8280/movies/all")
                .retrieve()
                .bodyToMono(MovieListResponse.class)
                .block();

        List<Movie2> items = new ArrayList<>();
        Movie2 tempMovie = null;
        RatingResponse response = null;

        if(movieList.getStatus()==5){

            for(Movie value : movieList.getMovieList()){
                response = webClientBuilder
                        .build()
                        .get()
                        .uri("http://localhost:8380/movie/rating/"+value.getId())
                        .retrieve()
                        .bodyToMono(RatingResponse.class)
                        .block();
                tempMovie = new Movie2(value.getId(),value.getName(),value.getDesc(),response.getRating());
                items.add(tempMovie);
            }
        }

        return new MovieCatelogResponse(5,"Success",items);
    }

}
