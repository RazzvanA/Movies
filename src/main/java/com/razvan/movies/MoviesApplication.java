package com.razvan.movies;

import com.razvan.movies.repository.MovieRepository;
import com.razvan.movies.resolver.MovieResolver;
import com.razvan.movies.resolver.Query;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

	@Bean
	public MovieResolver movieResolver(MovieRepository movieRepository) {
		return new MovieResolver(movieRepository);
	}

	@Bean
	public Query query(MovieRepository movieRepository) {
		return new Query(movieRepository);
	}
}
