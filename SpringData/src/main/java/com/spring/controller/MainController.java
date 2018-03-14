package com.spring.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.dao.CompanyRepository;
import com.spring.dao.CostumerRepository;
import com.spring.model.Company;
import com.spring.model.Costumer;

@Controller
public class MainController {

	@Autowired
	private CostumerRepository costumerRepository;
	@Autowired
	private CompanyRepository companyRepository;
	
	@RequestMapping("/")
	public void  home() {
//		companyRepository.save(new Company(111,"Ripley","emailRipley"));
//		companyRepository.save(new Company(222,"Paris","emailParis"));
//		companyRepository.save(new Company(333,"Tottus","emailTottus"));

//		costumerRepository.save(new Costumer(1,"Jack", "Bauer",111));
//		costumerRepository.save(new Costumer("Chloe", "O'Brian",222));
//		costumerRepository.save(new Costumer("Kim", "Bauer",222));
//		costumerRepository.save(new Costumer("David", "Palmer",111));
//		costumerRepository.save(new Costumer("Michelle", "Dessler",333));
		
	}
	@RequestMapping("/costumers")
	public @ResponseBody Iterable<Costumer> costumers(){
//		costumerRepository.save(new Costumer(111L,"Jack", "Bauer",111));
//		costumerRepository.save(new Costumer(222L,"Chloe", "O'Brian",222));
//		costumerRepository.save(new Costumer(333L,"Kim", "Bauer",222));
//		costumerRepository.save(new Costumer(444L,"David", "Palmer",111));
//		costumerRepository.save(new Costumer(555L,"Michelle", "Dessler",333));
		return costumerRepository.findAll();
	}
	@RequestMapping("/company")
	public @ResponseBody Iterable<Company> company(){
		return companyRepository.findAll();
	}
	
	@RequestMapping("/lastName/{lastName}")
	public @ResponseBody List<Costumer> customers(@PathVariable(value="lastName") String lastName){
		return costumerRepository.findByLastNameIgnoringCase(lastName);
	}
	
	@RequestMapping("/costumers/{companyName}")
	public @ResponseBody List<Costumer> list(@PathVariable(value="companyName") String name){
		return costumerRepository.findByCompanyName(name);
	}
	
	@RequestMapping("/costumers/id/{id}")
	public @ResponseBody List<Costumer> lista(@PathVariable(value="id") int id){
		return costumerRepository.findByCompanyId(id);
	}
	@RequestMapping("/addCostumers/")
	public @ResponseBody Iterable<Costumer> save(@RequestParam String firstName, @RequestParam String lastName,@RequestParam int companyId ){
		Costumer costumer= new Costumer(firstName,lastName,companyId);
		costumerRepository.save(costumer);
		return costumerRepository.findAll();
	}
	@RequestMapping("/addCompany/")
	public @ResponseBody Iterable<Company> saveCompany(@RequestParam String name, @RequestParam String email){
		Company company= new Company(name,email);
		companyRepository.save(company);
		return companyRepository.findAll();
	}
	
}
