package com.exercise.trunarrative.cloud.springrest.services;

import java.util.ArrayList;

import com.exercise.trunarrative.cloud.springrest.entities.Items;

public interface CompanyService {

	public ArrayList<Items> getCompanies();

	public ArrayList<Items> getCompany(String search_term);
	
	public ArrayList<Items> getCompanyOfficers(String companyNumber);
	
}
