package com.example.Movie.Service.repository;

import com.example.Movie.Service.domain.Movie;
import org.springframework.data.repository.CrudRepository;


public interface MovieRepository extends CrudRepository<Movie, Integer> {
}
