package com.razvan.movies.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.razvan.movies.model.Movie;
import com.razvan.movies.repository.MovieRepository;

import java.util.List;

public class Query implements GraphQLQueryResolver {
    private MovieRepository movieRepository;

    public Query(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }
}
