package com.example.Sniperproject1.Servicejdbc;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Sniperproject1.Pojojdbc.Pojojdbc;
import com.example.Sniperproject1.Repository.Myrepository;

@Service
public class Servicejdbc {

	@Autowired
	private Myrepository repo;
	
	//postmapping
	public Pojojdbc Product(Pojojdbc e) {
		return repo.save(e);
	}
		
	//getmapping
	public List<Pojojdbc> Getelements() {
		return repo.findAll();
	}
	//postmapping
	
	public List<Pojojdbc> putAll(List<Pojojdbc> e) {
		return repo.saveAll(eer);
	}
	
	//deletemapping
	public String delAll(int id) {
		 repo.deleteById(id);
		 return "deleted the value+id+id;
	}
	
	//delmapp
	
	public String delVal(String name) {
		repo.deleteByName(name);
		return "deleted--->"+name;
	}
	//getmapping for id
	public Pojojdbc getByname(String name) {
		return repo.getByName(name);
	}
	
	//update
	public Pojojdbc update(Pojojdbc e) {
		Pojojdbc getVal=repo.findById(e.getId()).orElse(null);
		getVal.setId(e.getId());
		getVal.setName(e.getName());
		return repo.save(getVal);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}
