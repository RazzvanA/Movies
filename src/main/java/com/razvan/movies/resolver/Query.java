package com.razvan.movies.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.razvan.movies.model.Movie;
import com.razvan.movies.repository.MovieRepository;

import java.util.List;

/**
 * Class using the Movie Repository interface to execute queries on the
 * Movie Document.
 */
public class Query implements GraphQLQueryResolver {
    /**
     * Creating Instance of the MovieRepository
     */
    private MovieRepository movieRepository;

    /**
     * Constructor of the Query class with the MovieRepository
     * as a parameter
     * @param movieRepository MovieRepository holding query methods
     */
    public Query(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    /**
     * Return a List<Movie> containing all the movies stored in movie document
     * @return List<Movie> containing all the movies stored in movie document
     */
    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }
}
