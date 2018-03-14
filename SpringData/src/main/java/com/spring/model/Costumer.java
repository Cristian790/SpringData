package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity(name="costumers")
public class Costumer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="firstname")
	private String firstName;
	@Column(name="lastname")
	private String lastName;
	
	@ManyToOne
	private Company company;
	public Costumer() {
		// TODO Auto-generated constructor stub
	}

	public Costumer(int id,String firstName, String lastName, int companyId) {
		super();
		this.id=id;
		this.firstName = firstName;
		this.lastName = lastName;
		
		this.company = new Company(companyId);
	}

	public Costumer(String firstName, String lastName, int companyId) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		
		this.company = new Company(companyId);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
		
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}


	@Override
	public String toString() {
		return "Costumer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", company=" + company
				+ "]";
	}


	
}
