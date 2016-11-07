package koga.automobile.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import koga.automobile.model.MovieModel;
import koga.automobile.repository.IMovieRepository;
 
 
@RestController
public class MovieRestController {
 
    @Autowired
    private IMovieRepository repo;
 
    //static final Logger logger = LogManager.getLogger(RestServiceController.class.getName());
 
    // CREATE
    @RequestMapping("/movies/create")
    @ResponseBody
    public String createMovie(String title, int year) {
        MovieModel movie = new MovieModel(title, year);
        try {
            repo.save(movie);
        } catch (Exception e) {
            //logger.error(e.getMessage());
            return e.getMessage();
        }
        return "creation successful: " + String.valueOf(movie.getId());
    }
 
    // READ
    @RequestMapping("/movies/read")
    @ResponseBody
    public String readMovie(long id) {
    	MovieModel movie;
        try {
            movie = repo.findOne(id);
        } catch (Exception e) {
            //logger.error(e.getMessage());
            return e.getMessage();
        }
        if (movie == null) {
            String errorMst = "no movie found for id " + id;
            //logger.error(errorMst);
            return errorMst;
        } else {
            return movie.getTitle() + " : " + movie.getYear();
        }
    }
 
    // UPDATE
    @RequestMapping("/movies/update")
    @ResponseBody
    public String readMovie(long id, String title, int year) {
    	MovieModel movie;
        try {
            movie = repo.findOne(id);
            movie.setTitle(title);
            movie.setYear(year);
            repo.save(movie);
        } catch (Exception e) {
            //logger.error(e.getMessage());
            return e.getMessage();
        }
        return movie.getTitle() + " : " + movie.getYear();
    }
 
    // DELETE
    @RequestMapping("/movies/delete")
    @ResponseBody
    public String deleteMovie(long id) {
        try {
            repo.delete(id);
        } catch (Exception e) {
            //logger.error(e.getMessage());
            return e.getMessage();
        }
        return "deletion successful";
    }
 
    @RequestMapping("/movies/readAllBeforeYear")
    public List<MovieModel> getMoviesBeforeYear(@RequestParam(value = "year") int year) {
        List<MovieModel> movies = repo.findByYearLessThan(year);
        return movies;
    }
}

