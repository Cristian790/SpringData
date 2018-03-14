package com.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity(name="company")
public class Company {

	@Id
	private int id;
	private String name;
	private String email;
	
	
	public Company() {}

	public Company(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		
	}

	public Company(int id) {
		super();
		this.id=id;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
}