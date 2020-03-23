package com.razvan.movies.repository;

import com.razvan.movies.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB Repository with queries for CRUD constructed automatically,
 * based on method names for Movie Document.
 */
@Repository
public interface MovieRepository extends MongoRepository<Movie, String  > {
}
