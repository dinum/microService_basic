package com.example.movieinfoservice.response;
import java.util.List;
public class MovieListResponse {

    private int status;
    private String desc;
    private List<Movie> movieList;

    public MovieListResponse(int status, String desc, List<Movie> movieList) {
        this.status = status;
        this.desc = desc;
        this.movieList = movieList;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }
}
