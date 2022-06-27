package com.exercise.trunarrative.cloud.springrest.entities;

public class Links {
	
	private String self;

	public String getSelf() {
		return self;
	}

	public void setSelf(String self) {
		this.self = self;
	}

	/**
	 * @param self
	 */
	public Links(String self) {
		super();
		this.self = self;
	}
	
}
