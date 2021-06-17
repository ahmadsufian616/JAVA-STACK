package com.NinjaGoldGame;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class gold {
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("total_gold") == null) {
			session.setAttribute("total_gold", 0);
		}
		return "gold.jsp";
	}

	
	@RequestMapping("/add")
	public String add(@RequestParam(value="type") String type,HttpSession session) {
		if("farm".equals(type)) {
			Random r = new Random();
			int max = 20;
			int min = 10;
			int n = r.nextInt(max + 1 - min) + min;
			session.setAttribute("total_gold", (Integer) session.getAttribute("total_gold") + n);
		}
		else if("cave".equals(type)) {
			Random r = new Random();
			int max = 10;
			int min = 5;
			int n = r.nextInt(max + 1 - min) + min;
			session.setAttribute("total_gold", (Integer) session.getAttribute("total_gold") + n);
		}
		else if("house".equals(type)) {
			Random r = new Random();
			int max = 5;
			int min = 2;
			int n = r.nextInt(max + 1 - min) + min;
			session.setAttribute("total_gold", (Integer) session.getAttribute("total_gold") + n);
		}
		else if("casino".equals(type)) {
			Random r = new Random();
			int max = 50;
			int min = -50;
			int n = r.nextInt(max + 1 - min) + min;
			session.setAttribute("total_gold", (Integer) session.getAttribute("total_gold") + n);
		}
		return "redirect:/";
	}
	

}
