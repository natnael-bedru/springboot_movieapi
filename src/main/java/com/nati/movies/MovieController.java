package com.nati.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    /*
    The @Autowired will let the framework know to instantiate
    the MovieRepository
     */
    @Autowired
    private MovieService movieService;

//    @GetMapping
//    public ResponseEntity<String> getAllMovies() {
//        return new ResponseEntity<String>("All Movies", HttpStatus.OK);
//    }


    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        /*
             returning a ResponseEntity of type list movie
        */
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
    }
}
