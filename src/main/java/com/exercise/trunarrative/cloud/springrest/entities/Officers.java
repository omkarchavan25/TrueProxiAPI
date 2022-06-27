package com.exercise.trunarrative.cloud.springrest.entities;

import java.util.List;

public class Officers {
	private String name;
	private String officerRole;
	private String appointedOn;
	private Address address;

	/**
	 * @param name
	 * @param officerRole
	 * @param appointedOn
	 * @param address
	 */
	public Officers(String name, String officerRole, String appointedOn, Address address) {
		super();
		this.name = name;
		this.officerRole = officerRole;
		this.appointedOn = appointedOn;
		this.address = address;
	}

	/**
	 * 
	 */
	public Officers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOfficerRole() {
		return officerRole;
	}

	public void setOfficerRole(String officerRole) {
		this.officerRole = officerRole;
	}

	public String getAppointedOn() {
		return appointedOn;
	}

	public void setAppointedOn(String appointedOn) {
		this.appointedOn = appointedOn;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
