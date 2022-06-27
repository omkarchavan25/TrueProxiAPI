package com.exercise.trunarrative.cloud.springrest.entities;

import java.sql.Array;

public class Title {
	
	private Array title;

	public Array getTitle() {
		return title;
	}

	public void setTitle(Array title) {
		this.title = title;
	}

	/**
	 * @param title
	 */
	public Title(Array title) {
		super();
		this.title = title;
	}

}
