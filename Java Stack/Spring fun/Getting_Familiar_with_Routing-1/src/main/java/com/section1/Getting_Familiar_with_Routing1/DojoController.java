package com.section1.Getting_Familiar_with_Routing1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class DojoController {

	@RequestMapping("/{track}")
	public String showLesson(@PathVariable("track") String track) {
		if(track=="dojo") 
		return "The dojo is awesome!";
		if(track=="burbank-dojo")
			return "Burbank Dojo is located in Southern California";
		if(track=="san-jose")
			return "SJ dojo is the headquarters";
		else {
			return "no match";
		}
		
		
	}

}
