package com.section1.Human1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class human {
	@RequestMapping("")
	public String welcomeGet(@RequestParam(value = "q", required = false) String name) {
		if (name == null) {
			return "<h1> hello human </h1>";
		}
		return "<h1> welcome " + name + " to our web</h1>";

	}
}