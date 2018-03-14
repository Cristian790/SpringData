package com.spring.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring.model.Company;

public interface CompanyRepository extends CrudRepository<Company, Integer> {

}
