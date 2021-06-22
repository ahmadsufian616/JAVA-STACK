package com.example.Lookify.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Lookify.models.Song;
import com.example.Lookify.services.SongService;

@Controller
public class controllers {
	private final  SongService S;

	
	public controllers(SongService s) {
		
		S = s;
	}
	@RequestMapping("")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/dashboard")
	public String dashboard(Model m) {
	m.addAttribute("song", S.findallsong());
		
		
		return "dashboard.jsp";
	}
	@RequestMapping("/Add_New")
	public String showaddform(Model m,@ModelAttribute("song") Song song) {
		List<Song> song1 = S.findallsong();
		m.addAttribute("Song", song);
		return"Addnew.jsp";
	}
	
	@RequestMapping(value = "/addsong", method = RequestMethod.POST)
	public String create(@Valid @ModelAttribute("song") Song song, BindingResult result) {
		if (result.hasErrors()) {
			return "Addnew.jsp";
		} else {
			S.createSong(song);
			return "redirect:/dashboard";
		}
	
}
	@RequestMapping("/view/{id}")
	public String showbyid(@PathVariable("id") Long id, Model m) {
		Song song = S.findbyid(id);
		m.addAttribute("songid", song);
		return "/viwe.jsp";

	}
	@RequestMapping("/delete/{id}")
	public String deletesong(@PathVariable("id")Long id ) {
		S.removebyid(id);
		return "redirect:/dashboard";
	}
	@RequestMapping("/search")
	public String Search(@RequestParam("artist") String artist, Model m) {
		m.addAttribute("songs",	S.songsContainingArtist(artist));
		m.addAttribute("artist", artist);
		return "search.jsp";
	}
	@RequestMapping("/topTen")
	public String TopTen(Model model) {
		model.addAttribute("songs", S.topTenByRating());
		return "Top10.jsp";
	}

	
	
	
}