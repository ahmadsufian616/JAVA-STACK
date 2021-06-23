package com.example.Dojo_and_Ninjas.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Dojo_and_Ninjas.Model.Dojo;
;

@Repository
public interface DojoRepo extends CrudRepository<Dojo, Long> {
	
	
	List<Dojo> findAll();

	
	

}
