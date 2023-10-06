package com.example.Sniperproject1.Contjdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Sniperproject1.Pojojdbc.Pojojdbc;
import com.example.Sniperproject1.Servicejdbc.Servicejdbc;

@RestController
public class Contjdbc {

	@Autowired
	private Servicejdbc sc;
	
	@PostMapping("/insert")
	public Pojojdbc insert(@RequestBody Pojojdbc er) {
		return sc.Product(er);
	}
	
	//getmapping
	@GetMapping("/get")
	public List<Pojojdbc> Getting() {
		return sc.Getelements();
	}

	//postmapping to put list of products
	
	@PostMapping("/putAll")
	public ist<Pojojdbc> getAll(List<Pojojdbc> e) {
		return sc.putAll(e);
	}
	
	//delete by id
	@DeleteMapping("/delAll")
public String delAll(@RequestParam int id) {
	return sc.delAll(id);
	}
	
	
	//delete by name
@DeleteMapping("/delVal")
public String delVal(@RequestParam String name) {
	return sc.delVal(name);
}

//getmapping

@GetMapping("/getName")
public Pojojdbc getValbyName(@RequestParam String name) {
	return sc.getByname(name);
}

@PutMapping("/update")

public Pojojdbc update(@RequestBody Pojojdbc e) {
	return sc.update(e);
}


	
	
	
	
	
	
	
	
}