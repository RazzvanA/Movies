package com.razvan.movies;

import com.razvan.movies.repository.MovieRepository;
import com.razvan.movies.resolver.Mutation;
import com.razvan.movies.resolver.Query;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MoviesApplication {

	/**
	 * Main method used to initialize the Movies Application
	 * @param args String[] holding the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

	/**
	 * Spring Bean that resolves the Query
	 * @param movieRepository MovieRepository containing methods to access the movie document
	 * @return Query containing the queries to be executed on the movie document
	 */
	@Bean
	public Query query(MovieRepository movieRepository) {
		return new Query(movieRepository);
	}

	@Bean
	public Mutation mutation(MovieRepository movieRepository) {
		return new Mutation(movieRepository);
	}
}
