package com.exercise.trunarrative.cloud.springrest.entities;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Company {
	private String companyStatus;
	private String addressSnippet;
	private String dateOfCreation;
	private Matches matches;
	private String description;
	private Links links;
	private String companyNumber;
	private String title;
	private String companyType;
	private Address address;
	private List<Officers> officers;
	private String kind;
	private String[] descriptionIdentifier;

	/**
	 * @param companyNumber
	 * @param companyType
	 * @param title
	 * @param companyStatus
	 * @param address
	 * @param officers
	 */
	public Company(String companyNumber, String companyType, String title, String companyStatus, Address address,
			List<Officers> officers) {
		super();
		this.companyNumber = companyNumber;
		this.companyType = companyType;
		this.title = title;
		this.companyStatus = companyStatus;
		this.address = address;
		this.officers = officers;
	}
	
	
	/**
	 * @param companyStatus
	 * @param addressSnippet
	 * @param dateOfCreation
	 * @param matches
	 * @param description
	 * @param links
	 * @param companyNumber
	 * @param title
	 * @param companyType
	 * @param address
	 * @param officers
	 * @param kind
	 * @param descriptionIdentifier
	 */
	public Company(String companyStatus, String addressSnippet, String dateOfCreation, Matches matches,
			String description, Links links, String companyNumber, String title, String companyType, Address address, String kind, String[] descriptionIdentifier) {
		super();
		this.companyStatus = companyStatus;
		this.addressSnippet = addressSnippet;
		this.dateOfCreation = dateOfCreation;
		this.matches = matches;
		this.description = description;
		this.links = links;
		this.companyNumber = companyNumber;
		this.title = title;
		this.companyType = companyType;
		this.address = address;
		this.kind = kind;
		this.descriptionIdentifier = descriptionIdentifier;
	}




	public String getCompanyStatus() {
		return companyStatus;
	}

	public void setCompanyStatus(String companyStatus) {
		this.companyStatus = companyStatus;
	}

	public String getAddressSnippet() {
		return addressSnippet;
	}

	public void setAddressSnippet(String addressSnippet) {
		this.addressSnippet = addressSnippet;
	}

	public String getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(String dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

	public Matches getMatches() {
		return matches;
	}

	public void setMatches(Matches matches) {
		this.matches = matches;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCompanyNumber() {
		return companyNumber;
	}

	public void setCompanyNumber(String companyNumber) {
		this.companyNumber = companyNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompanyType() {
		return companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Officers> getOfficers() {
		return officers;
	}

	public void setOfficers(List<Officers> officers) {
		this.officers = officers;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String[] getDescriptionIdentifier() {
		return descriptionIdentifier;
	}

	public void setDescriptionIdentifier(String[] descriptionIdentifier) {
		this.descriptionIdentifier = descriptionIdentifier;
	}


	public Links getLinks() {
		return links;
	}


	public void setLinks(Links links) {
		this.links = links;
	}
	
}
