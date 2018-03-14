package com.spring.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring.model.Company;
import com.spring.model.Costumer;

public interface CostumerRepository extends CrudRepository<Costumer, Integer>{
	
	List<Costumer> findByLastNameIgnoringCase(String lastName);
	
	List<Costumer> findAllByFirstNameAndLastNameIgnoringCase(String firstName, String lastName);
	
	List<Costumer> findByCompanyName(String name);
	
	List<Costumer> findByCompanyId(int id);
}
