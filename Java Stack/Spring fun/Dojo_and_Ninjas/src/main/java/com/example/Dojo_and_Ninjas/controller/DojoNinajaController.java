package com.example.Dojo_and_Ninjas.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.Dojo_and_Ninjas.Model.Dojo;
import com.example.Dojo_and_Ninjas.Model.Ninja;
import com.example.Dojo_and_Ninjas.serviceAll.Services;

@Controller
public class DojoNinajaController {
	private final Services S;

	public DojoNinajaController(Services s) {
		super();
		S = s;
	}

	@RequestMapping("/")
	public String index(@ModelAttribute("dojo") Dojo dojo,Model m) {
		m.addAttribute("dojo1", S.findAllDojo());
		return "Newdojo.jsp";

	}

	@RequestMapping(value = "/add_dojo", method = RequestMethod.POST)
	public String createDojo(@ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "Newdojo.jsp";
		}
		S.createDojo(dojo);
		return "redirect:/ninjaform";
	}

	@RequestMapping("/ninjaform")
	public String ninjaindex(@ModelAttribute("ninja") Ninja ninja, Model m) {
		List<Dojo> dojo = S.findAllDojo();
		m.addAttribute("dojo", dojo);
		return "NewNinja.jsp";
	}

	@RequestMapping(value = "/add_ninjas", method = RequestMethod.POST)
	public String Create(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("dojos", this.S.findAllDojo());
			return "/ninjas/new.jsp";
		}
		S.createNinja(ninja);
		return "redirect:/ninjaform";
	}
	@RequestMapping("/{id}")
	public String Show(@PathVariable("id") Long id, Model model) {
		model.addAttribute("dojo", S.findDojo(id));
		return "/show.jsp";

	}
}