package org.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping(value="/home",method= {RequestMethod.GET})
	public ModelAndView mainView() {
		return new ModelAndView("main");
	}
	
	@RequestMapping(value="/gallery",method= {RequestMethod.GET})
	public ModelAndView getGallery() {
		return new ModelAndView("gallery");
	}

}
