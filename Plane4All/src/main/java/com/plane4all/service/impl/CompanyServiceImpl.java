package com.plane4all.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plane4all.dao.assets.CompanyDao;
import com.plane4all.model.assets.Company;
import com.plane4all.service.CompanyService;

@Service("companyService")
public class CompanyServiceImpl implements CompanyService{

	@Autowired
	CompanyDao companyDao;
	
	public List<Company> retriveAllCompanies(){
		Iterable<Company> comapnies = companyDao.findAll();
		for (Company company : comapnies) {
			System.out.println("Company Name is :   " + company.getCompanyName());
		}
		
		
		return (List<Company>)comapnies;
	}
	
	
	public Company retriveCompany(int id){
		Company comapny = companyDao.findOne(id);
		
		return comapny;
	}
	
}
