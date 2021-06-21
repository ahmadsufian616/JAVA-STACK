package com.example.Languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.example.Languages.models.Languages;
import com.example.Languages.repositories.langrepository;
@Service
public class langservice {
	private final langrepository repo;

	public langservice(langrepository repo) {
		
		this.repo = repo;
	}
	public  List<Languages> allLang(){
		
		return repo.findAll();
	}
	
	public Languages createlang(Languages lang) {
		return repo.save(lang);
		
	} 
	public Languages findlang(Long id) {
		Optional<Languages> optionalLanguages = repo.findById(id);
		if (optionalLanguages.isPresent()) {
			return optionalLanguages.get();
		} else {
			return null;
		}
	}
		
	public Languages removebyid(Long id) {
		Optional<Languages> optionalLanguages = repo.findById(id);
		repo.deleteById(id);
		return optionalLanguages.get();
	
	
	}
public   Languages  updateBook (Languages lang) {
	 return createlang( lang);
	
}
}
