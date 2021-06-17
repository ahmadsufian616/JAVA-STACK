package com.TheCode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeController {
	private Boolean isCorrectCode(String guess) {
		return guess.equals("bushido");
	}
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
		
	}
	@RequestMapping("/code1")
	public String inde2() {
		return "code.jsp";
		
	}
	
	@RequestMapping(value="/code",method=RequestMethod.POST)
	public String code(@RequestParam(value="code") String code, RedirectAttributes redirectAttributes) {	
		if(isCorrectCode(code)) {
			
			return "redirect:/code1";
			
		}
		redirectAttributes.addFlashAttribute("error","you must  train harder");
			return "redirect:/";
		
	}

}
 