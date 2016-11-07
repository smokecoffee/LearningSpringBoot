/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koga.automobile.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/test")
public class TestController {

	private final String htmlPage = "test";
	private final String KEY_NAME = "name";

	@RequestMapping(method = GET)
	public String truong(String name, Model model) {
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
}
