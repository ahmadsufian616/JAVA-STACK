package com.example.Languages.controller;

import java.awt.print.Book;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.Languages.models.Languages;
import com.example.Languages.services.langservice;

@Controller
public class controllers {
	public final langservice lService;

	public controllers(langservice lService) {

		this.lService = lService;
	}

	@RequestMapping("/")
	public String index(Model m, @ModelAttribute("language") Languages language) {
		List<Languages> lang = lService.allLang();
		m.addAttribute("languages", lang);
		return "Languages.jsp";

	}

	@RequestMapping(value = "/addlang", method = RequestMethod.POST)
	public String create(@Valid @ModelAttribute("language") Languages language, BindingResult result) {
		if (result.hasErrors()) {
			return "Languages.jsp";
		} else {
			lService.createlang(language);
			return "redirect:/";
		}
	}

	@RequestMapping("/show/{id}")
	public String showbyid(@PathVariable("id") Long id, Model m) {
		Languages languages = lService.findlang(id);
		m.addAttribute("Languagesid", languages);
		return "/show.jsp";

	}

	@RequestMapping(value = "/delete/{id}")
	public String destroy(@PathVariable("id") Long id) {
		lService.removebyid(id);
		return "redirect:/";
	}

	@RequestMapping("/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model model) {
		Languages languages = lService.findlang(id);
		model.addAttribute("Languageedit", languages);
		return "/edit.jsp";
	}

	@RequestMapping(value="/edit/{id}")
	    public String update(@Valid @ModelAttribute("Languagesedit2") Languages languages, BindingResult result) {
	        if (result.hasErrors()) {
	            return "edit.jsp";
	        } else {
	        	lService.updateBook(languages);
	            return "redirect:/";
	        }
	    
	 
	}
	 
	 
}
