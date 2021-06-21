package com.example.Languages.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.Languages.models.Languages;

public interface langrepository extends CrudRepository<Languages, Long>{//why long noy id//
	List<Languages> findAll();
	 

}
