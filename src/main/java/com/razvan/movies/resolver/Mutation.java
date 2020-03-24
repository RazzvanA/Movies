package com.razvan.movies.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.razvan.movies.model.Movie;
import com.razvan.movies.repository.MovieRepository;

public class Mutation implements GraphQLMutationResolver {
    private MovieRepository movieRepository;

    public Mutation(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie addMovie(String name, double price, int length, boolean available) {
        Movie movie = new Movie();
        movie.setName(name);
        movie.setPrice(price);
        movie.setLength(length);
        movie.setAvailable(available);

        movieRepository.save(movie);

        return movie;
    }
}
