package com.razvan.movies.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.razvan.movies.model.Movie;
import com.razvan.movies.repository.MovieRepository;

import java.util.List;

public class MovieResolver implements GraphQLResolver<Movie> {
    private  MovieRepository movieRepository;

    public MovieResolver(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> findAll() {
        return movieRepository.findAll();
    }
}
