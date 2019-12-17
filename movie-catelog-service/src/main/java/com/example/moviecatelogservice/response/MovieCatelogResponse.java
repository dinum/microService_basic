package com.example.moviecatelogservice.response;

import com.example.moviecatelogservice.request.Movie2;

import java.util.List;

public class MovieCatelogResponse {

    private int status = 0;
    private String statusDesc = null;
    private List<Movie2> movieList;

    public MovieCatelogResponse(int status, String statusDesc, List<Movie2> movieList) {
        this.status = status;
        this.statusDesc = statusDesc;
        this.movieList = movieList;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    public List<Movie2> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie2> movieList) {
        this.movieList = movieList;
    }
}
