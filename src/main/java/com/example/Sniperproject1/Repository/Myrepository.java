package com.example.Sniperproject1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Sniperproject1.Pojojdbc.Pojojdbc;

public interface Myrepository extends JpaRepository<Pojojdbc, Integer> {

	String deleteByName(String name);

	Pojojdbc getByName(String name);
	
	
}
