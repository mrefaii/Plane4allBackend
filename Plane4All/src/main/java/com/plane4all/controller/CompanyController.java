package com.plane4all.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plane4all.model.assets.Company;
import com.plane4all.service.CompanyService;

@RestController
public class CompanyController {

	@Autowired
	private CompanyService companyService;
	
	@RequestMapping (value = "/company/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Company>> retriveAllCompanies(){
		List<Company> companies = companyService.retriveAllCompanies();
		if (companies == null){
			return new ResponseEntity<List<Company>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Company>>(companies,HttpStatus.OK);
	}
	
	@RequestMapping (value = "/company/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Company> retriveAllCompanies(@PathVariable("id") int id){
		Company company = companyService.retriveCompany(id);
		if (company == null){
			return new ResponseEntity<Company>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Company>(company,HttpStatus.OK);
	}
	
}
