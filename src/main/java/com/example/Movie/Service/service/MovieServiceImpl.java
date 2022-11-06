package com.example.Movie.Service.service;

import com.example.Movie.Service.domain.Movie;
import com.example.Movie.Service.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

    MovieRepository movieRepository;
    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }
    @Override
    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }
}
