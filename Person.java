package com.claim;



public class Person {
	private String firstName;
	private String middleName;

	private String lastName;
	private String address;
	private String phoneNum;

	// for just one middle name
	public Person(String firstName, String middleName, String lastName, String address, String phoneNum) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
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

	public String getMiddleName() {
		return this.middleName;
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

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	Person [] people = new Person[0];

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String toString() {
		//Person p = new Person();
		return "First name: " + this.firstName+"\n" + "Middle Name: " + this.middleName + "\n" + "Last Name: " + this.lastName + "\n" + "Address: " + this.address + "\n" + 
				"Phone number: (" +this.phoneNum.substring(0, 3) +")" + this.phoneNum.substring(3, 6) + "-"+this.phoneNum.substring(6, 10);
	}

	
}

