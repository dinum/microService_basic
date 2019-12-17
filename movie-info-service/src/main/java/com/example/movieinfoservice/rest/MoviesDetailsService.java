package com.example.movieinfoservice.rest;

import com.example.movieinfoservice.response.Movie;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.movieinfoservice.response.MovieListResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MoviesDetailsService {

    @RequestMapping("/all")
    public MovieListResponse getAllMovies(){
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie(1,"Bay Watch","Family Movie"));
        movieList.add(new Movie(2,"X Men","Family Movie"));
        movieList.add(new Movie(3,"Perfume","Alders Only"));
        movieList.add(new Movie(4,"Astrix","cartoon"));
        movieList.add(new Movie(5,"Avator","animation"));

        return new MovieListResponse(5,"Success",movieList);
    }

}
