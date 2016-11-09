package koga.automobile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class IndexController {
	
	
	private final String htmlPage = "test";
	private final String KEY_NAME = "name";
	@RequestMapping(path = "/test", method = GET)
	public String testPage(String name, Model model) {
		if (name != null && name.trim().length() > 0) {
			if (!name.equalsIgnoreCase("admin"))
				model.addAttribute(KEY_NAME, "this is not an admin");
			else
				model.addAttribute(KEY_NAME, "this is an admin");
		} else {
			model.addAttribute(KEY_NAME, "Enter parma, please!");
		}
		return htmlPage;
	}

	@RequestMapping(path = "/showMap", method = GET)
	public String showMapLeaflet() {
		return "showMap";
	}
	
	@RequestMapping(path = "/siteMap", method = GET)
	public String siteMap() {
		return "siteMap";
	}
}
