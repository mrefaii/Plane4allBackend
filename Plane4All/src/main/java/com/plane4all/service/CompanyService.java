package com.plane4all.service;

import java.util.List;

import com.plane4all.model.assets.Company;

public interface CompanyService {
	public List<Company> retriveAllCompanies();
	public Company retriveCompany(int id);
}
