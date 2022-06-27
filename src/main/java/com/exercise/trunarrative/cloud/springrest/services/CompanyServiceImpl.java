package com.exercise.trunarrative.cloud.springrest.services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.exercise.trunarrative.cloud.springrest.entities.Address;
import com.exercise.trunarrative.cloud.springrest.entities.Company;
import com.exercise.trunarrative.cloud.springrest.entities.Items;
import com.exercise.trunarrative.cloud.springrest.entities.Links;
import com.exercise.trunarrative.cloud.springrest.entities.Matches;
import com.exercise.trunarrative.cloud.springrest.entities.Officers;

@Service
public class CompanyServiceImpl implements CompanyService {

	Address address;
	Links links;
	Date date;
	String readableDate;
	Matches matches;
	ArrayList<Items> items;
	List<Company> companies;
	List<Company> companyList;
	List<Officers> officers = new ArrayList<>();

	public CompanyServiceImpl() {
		companyList = new ArrayList<>();
		companies = new ArrayList<>();
		items = new ArrayList<>();
		date = new Date(System.currentTimeMillis());
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		readableDate = formatter.format(date);
		matches = new Matches();
		
		Integer title[] = {1,3};
		matches.setTitle(title);
		
		String[] descriptionIdentifier = {"incorporated-on"};
		
		links = new Links("/company/06500244");
		address = new Address("Retford", "DN22 0AD", "Boswell Cottage Main Street", "North Leverton", "England");
		officers.add(new Officers("BOXALL, Sarah Victoria", "secretary", "2008-02-11", address));
		officers.add(new Officers("Walton, Richard Steven", "manager", "2010-02-21", address));
		companyList.add(new Company("06500244", "ltd", "BBC LIMITED", "active", address, officers));
		companies.add(new Company("active", "Boswell Cottage Main Street, North Leverton, Retford, "
				+ "England, DN22 0AD", readableDate, matches,"06500244 - Incorporated on 11 February 2008",links, 
				"06500244", "BBC LIMITED","ltd", address,"searchresults#company", descriptionIdentifier));
	}

	@Override
	public ArrayList<Items> getCompanies() {
		items = new ArrayList<>();
		Company company = null;

		for (Company comp : companyList) {
			company = comp;
		}
		items.add(new Items(company, "1"));
		return items;
	}

	@Override
	public ArrayList<Items> getCompany(String search_term) {
		items = new ArrayList<>();
		Company company = null;

		for (Company comp : companies) {
			if (comp.getCompanyNumber().equals(search_term)) {
				company = comp;
				break;
			}
		}
		items.add(new Items(company, "1", "1", "search#companies"));
		return items;
	}

	@Override
	public ArrayList<Items> getCompanyOfficers(String companyNumber) {
		items = new ArrayList<>();
		Company company = null;

		for (Company comp : companies) {
			if (comp.getCompanyNumber().equals(companyNumber)) {
				company = comp;
				break;
			}
		}
		items.add(new Items("6dd2261e61776d79c2c50685145fac364e75e24e", links, company, "officer-list", "35"));

		return items;
	}

}
