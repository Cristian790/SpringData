package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.dao.CostumerRepository;
import com.spring.model.Costumer;

@Controller
public class MainController {

	@Autowired
	private CostumerRepository costumerRepository;
	
	@RequestMapping("/")
	public @ResponseBody Iterable<Costumer> home() {
		costumerRepository.save(new Costumer("Jack", "Bauer"));
		costumerRepository.save(new Costumer("Chloe", "O'Brian"));
		costumerRepository.save(new Costumer("Kim", "Bauer"));
		costumerRepository.save(new Costumer("David", "Palmer"));
		costumerRepository.save(new Costumer("Michelle", "Dessler"));
		return costumerRepository.findAll();
	}
	
	@RequestMapping("/lastName/{lastName}")
	public @ResponseBody List<Costumer> list(@PathVariable(value="lastName") String lastName){
		return costumerRepository.findByLastNameIgnoringCase(lastName);
	}
}
