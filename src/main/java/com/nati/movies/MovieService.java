package com.nati.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    /*
    The @Autowired will let the framework know to instantiate
    the MovieRepository
     */
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }
    /*
    Object Id
    public Optional<Movie> singleMovie(ObjectId id) {
        // The Optional tag allows if there isn't any movie by that id
        // this uses collection ids of the collection entities ..
        return movieRepository.findById(id);
    }
    */
    public Optional<Movie> singleMovie(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
