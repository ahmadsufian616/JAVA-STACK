package com.example.Dojo_and_Ninjas.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Dojo_and_Ninjas.Model.Ninja;

@Repository
public interface NinjaRepo extends CrudRepository<Ninja, Long> {
	
	List<Ninja> findAll();

}
