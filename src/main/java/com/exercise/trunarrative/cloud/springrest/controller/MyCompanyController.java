package com.exercise.trunarrative.cloud.springrest.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exercise.trunarrative.cloud.springrest.entities.Items;
import com.exercise.trunarrative.cloud.springrest.services.CompanyService;

@RestController
@Validated
public class MyCompanyController {

	@Autowired
	private CompanyService companyService;

	@GetMapping("/TruProxyAPI/rest/Companies")
	public ArrayList<Items> getCompanies() {
		return this.companyService.getCompanies();
	}

	@GetMapping("/TruProxyAPI/rest/Companies/v1/Search")
	public ArrayList<Items> getCompany(@RequestHeader(value = "x-api-key", required = true) String apiKey,
			@RequestParam String search_term) throws Exception {
		
		if (apiKey == null) {
			throw new Exception("Forbidden");
		}
		return this.companyService.getCompany(search_term);
	}
	
	@GetMapping("/TruProxyAPI/rest/Companies/v1/Officers")
	public ArrayList<Items> getCompanyOfficers(@RequestHeader(value = "x-api-key", required = true) String apiKey,
			@RequestParam String companyNumber) throws Exception {
		if (apiKey == null) {
			throw new Exception("Forbidden");
		}
		return this.companyService.getCompanyOfficers(companyNumber);
	}

}
