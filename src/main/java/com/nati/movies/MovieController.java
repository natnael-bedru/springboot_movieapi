package com.nati.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

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
/*    Object Id
      @GetMapping("/{id}")
      public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable ObjectId id) {
          // this uses collection ids of the collection entities ..
          return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(id), HttpStatus.OK);
     }
 */
    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbId) {
        // this uses collection ids of the collection entities ..
        // if it doesn't exist returns 'null'
        return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(imdbId), HttpStatus.OK);
    }
}
