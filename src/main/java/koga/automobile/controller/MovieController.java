/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koga.automobile.controller;

import koga.automobile.dao.MovieDao;
import koga.automobile.model.MovieModel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/movie")
public class MovieController {

	@RequestMapping(method = GET)
	public String movie(Model model) {
		// MovieModel movieModel = movieDao.getByYear(year);
		List<MovieModel> list = movieDao.getAllMovie();
		model.addAttribute("movieModels", list);
		return "movie";
	}

	// Wire the UserDao used inside this controller.
	@Autowired
	private MovieDao movieDao;
}
