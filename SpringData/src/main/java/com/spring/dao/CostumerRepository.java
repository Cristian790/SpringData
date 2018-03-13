package com.spring.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring.model.Costumer;

public interface CostumerRepository extends CrudRepository<Costumer, Long>{
	
	List<Costumer> findByLastNameIgnoringCase(String lastName);
	
	List<Costumer> findAllByFirstNameAndLastNameIgnoringCase(String firstName, String lastName);
	
}
