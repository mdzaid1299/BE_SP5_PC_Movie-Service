package com.example.Movie.Service.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
    @Id
    private int movieId;
    private String movieName,actorName,directorName;

    public Movie(int movieId, String movieName, String actorName, String directorName) {

        this.movieId = movieId;
        this.movieName = movieName;
        this.actorName = actorName;
        this.directorName = directorName;
    }

    public Movie() {
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }
}
