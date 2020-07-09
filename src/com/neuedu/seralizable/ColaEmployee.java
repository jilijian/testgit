package com.neuedu.seralizable;

import java.io.Serializable;

public class ColaEmployee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int month;

	public ColaEmployee(String name, int month) {
		this.month = month;
		this.name = name;
	}

	public int getMonth() {
		return month;
	}

	public String getName() {
		return name;
	}

	public double getSalary(int month) {

		if (month == this.getMonth())
			return 100;
		else
			return 0;
	}

}
