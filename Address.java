package com.claim;

public class Address {

	private String zipCode;
	private String streetName;
	private String city;
	private String state;

	public Address() {
		
	}
		//Setting the constructor
	public Address(String streetName, String city, String zipCode, String state) {
		this.streetName = streetName;
		this.city = city;
		this.zipCode = zipCode;
		this.state = state;
	}
		//Overloading the constructor
	public Address(String apartNum, String streetName, String city, String zipCode, String state) {
	
		this.streetName = streetName;
		this.city = city;
		this.zipCode = zipCode;
		this.state = state;
	}



	public String getZipCode() {
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



	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}
}
