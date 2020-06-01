package com.claim;

public class Person {
	private String firstName;
	private String middleName1;
	private String middleName2;
	private String lastName;
	private Address address;
	private phoneNum phoneNum;
	
	//for just one middle name
	public Person(String firstName, String middleName1, String lastName) {
		this.firstName = firstName;
		this.lastName  = lastName;
		this.middleName1 = middleName1;
	}
	//for two middle names
	public Person(String firstName, String middleName1, String middleName2, String lastName) {
		this.firstName = firstName;
		this.middleName1 = middleName1;
		this.middleName2 = middleName2;
		this.lastName = lastName;
	}
	//Setters and getters
	public String getFirstName() {
		return this.firstName;
	}
	public String getMiddleName1() {
		return this.middleName1;
	}
	public String getMiddleName2() {
		return this.middleName2;
	}
	public String getLastName(String lastName) {
		return this.lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setMiddleName1(String middleName1) {
		this.middleName1 = middleName1;
	}
	public void setMiddleName2(String middleName2) {
		this.middleName2 = middleName2;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
