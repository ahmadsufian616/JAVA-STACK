package com.example.Dojo_and_Ninjas.serviceAll;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.Dojo_and_Ninjas.Model.Dojo;
import com.example.Dojo_and_Ninjas.Model.Ninja;
import com.example.Dojo_and_Ninjas.Repository.DojoRepo;
import com.example.Dojo_and_Ninjas.Repository.NinjaRepo;

@Service
public class Services {
	private final DojoRepo DR;
	private final NinjaRepo NR;
	

	
	
	public Services(DojoRepo dR, NinjaRepo nR) {
		super();
		DR = dR;
		NR = nR;
	}
	public Dojo createDojo(Dojo dojo) {
		return DR.save(dojo);
		
	}
	public List<Dojo> findAllDojo(){
		return DR.findAll();
	}	
	public Ninja createNinja(Ninja ninja) {
		return NR.save(ninja);
		
	}
	public List<Ninja> findAllNinja(){
		return NR.findAll();
	}	

	public Dojo findbyDojo(Long id) {
		Optional<Dojo> O= DR.findById(id);
		if(O.isPresent())
		 return O.get();
		return null;
	}
		
	public Dojo findDojo(Long id) {
		return this.DR.findById(id).orElse(null);
	}
	}
	


