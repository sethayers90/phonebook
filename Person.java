package com.claim;

public class Person {
	private String firstName;
	private String middleName1;
	private String middleName2;
	private String lastName;
	private String address;
	private String phoneNum;

	// for just one middle name
	public Person(String firstName, String middleName1, String lastName, String address, String phoneNum) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName1 = middleName1;
		this.address = address;
		this.phoneNum = phoneNum;
	}

	// for two middle names
	public Person(String firstName, String middleName1, String middleName2, String lastName, String address,
			String phoneNum) {
		this.firstName = firstName;
		this.middleName1 = middleName1;
		this.middleName2 = middleName2;
		this.lastName = lastName;
		this.address = address;
		this.phoneNum = phoneNum;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	// Setters and getters
	public String getAddress() {
		return this.address;
	}

	public String getPhoneNum() {
		return this.phoneNum;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getMiddleName1() {
		return this.middleName1;
	}

	public String getMiddleName2() {
		return this.middleName2;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
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
	public void addPerson(Person person1) {
		Person [] people = new Person[0];
		Person [] temp = new Person [people.length + 1];
		for(int i = 0 ; i < people.length; i++) {
			temp[i] = people[i];
		}
		temp[temp.length -1] = person1;
		people = temp;
	}
}