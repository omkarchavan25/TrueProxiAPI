package com.exercise.trunarrative.cloud.springrest.entities;

public class Address {
	private String locality;
	private String postalCode;
	private String premises;
	private String addressLine1;
	private String country;
	/**
	 * @param locality
	 * @param postalCode
	 * @param premises
	 * @param addressLine1
	 * @param country
	 */
	public Address(String locality, String postalCode, String premises, String addressLine1, String country) {
		super();
		this.locality = locality;
		this.postalCode = postalCode;
		this.premises = premises;
		this.addressLine1 = addressLine1;
		this.country = country;
	}
	/**
	 * 
	 */
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getPremises() {
		return premises;
	}
	public void setPremises(String premises) {
		this.premises = premises;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
