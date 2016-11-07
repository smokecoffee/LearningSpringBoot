package koga.automobile.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import koga.automobile.dao.CanDetailDataDao;
import koga.automobile.dao.MovieDao;
import koga.automobile.model.CanDetailDataModel;
import koga.automobile.model.MovieModel;

@RestController
public class SampleApi {

	@Autowired
	private MovieDao movieDao;
	
	@Autowired
	private CanDetailDataDao canDetailDataDao;

	@RequestMapping(value = "/sampleApi", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public String sampleApi(Model model) {
		List<MovieModel> list = movieDao.getAllMovie();

		Gson gson = new Gson();
		// convert list to json
		String jsonCartList = gson.toJson(list);
		return jsonCartList;// "{\"success\":1}";
	}
	
	@RequestMapping(value = "/canDetailDataApi", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public String getDetailDataApi(Model model) {
		List<CanDetailDataModel> list = canDetailDataDao.getAll();

		Gson gson = new Gson();
		// convert list to json
		String jsonCartList = gson.toJson(list);
		return jsonCartList;
	}
}
