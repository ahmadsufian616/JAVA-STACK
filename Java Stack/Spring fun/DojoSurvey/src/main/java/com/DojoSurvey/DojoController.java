package com.DojoSurvey;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DojoController {

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}

	@RequestMapping(value = "/result", method = RequestMethod.POST)
	public String result(@RequestParam(value = "name") String name, @RequestParam(value = "dojo") String dojo,
			@RequestParam(value = "lan") String lan, @RequestParam(value = "comment") String comment,Model m) {
		m.addAttribute("name",name);
		m.addAttribute("dojo",dojo);
		m.addAttribute("lan",lan);
		m.addAttribute("comment",comment);
		return "result.jsp";
		

	}

}
