package com.example.Movie.Service.controller;

import com.example.Movie.Service.domain.Movie;
import com.example.Movie.Service.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movieDatabase/v1")
public class MovieController {
    MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }
    @PostMapping("/movie")
    public ResponseEntity<?> saveMovie(@RequestBody Movie movie){
        Movie movie1 = movieService.saveMovie(movie);
        return new ResponseEntity<>(movie1, HttpStatus.CREATED);
    }
}
