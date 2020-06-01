package com.claim;

public class Address {
	private double streetNum; // Made this a double just incase
	private String apartNum; // Added this just incase I want to expand also, sometimes apartments have
								// letters attached
	private int zipCode;
	private String streetName;
	private String city;
	private String state;

		//Setting the constructor
	public Address(double streetNum, String streetName, String city, int zipCode, String state) {
		this.streetName = streetName;
		this.streetNum = streetNum;
		this.city = city;
		this.zipCode = zipCode;
		this.state = state;
	}
		//Overloading the constructor
	public Address(String apartNum, String streetName, String city, int zipCode, String state) {
		this.apartNum = apartNum;
		this.streetName = streetName;
		this.city = city;
		this.zipCode = zipCode;
		this.state = state;
	}

	public double getStreetNum() {
		return this.streetNum;
	}

	public String getApartNum() {
		return this.apartNum;
	}

	public int getZipCode() {
		return this.zipCode;
	}

	public String getStreetName() {
		return this.streetName;
	}

	public String getCity() {
		return this.city;
	}

	public String getState() {
		return this.state;
	}

	public void setStreetNum(double streetNum) {
		this.streetNum = streetNum;
	}

	public void setApartNum(String apartNum) {
		this.apartNum = apartNum;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}
}
