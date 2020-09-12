package com.Spring.Messanger.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class GreetingController {
	
	@GetMapping
	public ModelAndView greeting() {
		ModelAndView mav = new ModelAndView("main");
		return mav;
	}

}
