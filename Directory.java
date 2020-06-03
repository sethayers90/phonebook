package com.claim;

import java.util.Arrays;

public class Directory extends Person {
	Person[] people = new Person[0];

	public void addPerson(Person person1) {
		Person[] temp = new Person[people.length + 1];
		for (int i = 0; i < people.length; i++) {
			temp[i] = people[i];
		}
		temp[temp.length - 1] = person1;
		people = temp;
	}

	public void deletePerson() {
		int x = 0; // counter
		Person[] temp = new Person[people.length - 1];

		for (int i = 0; i < people.length; i++) {

			Person p = people[i];
			if (!p.getPhoneNum().equals(getPhoneNum())) {
				temp[x] = people[i];
				x++;
			}
		}
		people = temp;
	}

	// Needs a toString method
	public void searchByFirst() {
		System.out.println("Here's the information you requested: ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		int x = 0; // counter
		Person[] temp = new Person[people.length];

		for (int i = 0; i < people.length; i++) {
			Person p = people[i];
			if (p.getFirstName().equals(getFirstName())) {
				temp[x] = people[i];
				x++;

			}
			System.out.println(people[i].toString());
		}
	}

	public void searchByLast() {
		System.out.println("Here's the information you requested: ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		int x = 0; // countershowList();
		Person[] temp = new Person[people.length];

		for (int i = 0; i < people.length; i++) {
			Person p = people[i];
			if (p.getLastName().equals(getLastName())) {
				temp[x] = people[i];
				x++;

			}
			System.out.println(people[i].toString());
		}
	}

	public void showList() {
		System.out.println("Here's the information you requested: ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		Person[] temp = new Person[people.length + 1];
		for (int i = 0; i < people.length; i++) {
			Arrays.sort(people);
			System.out.println(people[i].toString());

		}

	}
	public void searchByFull() {
		System.out.println("Here's the information you requested: ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		int x = 0;
		Person [] temp = new Person[people.length + 1];
		for(int i=0; i < people.length; i++) {
			Person p = people[i];
			if (p.getFirstName().equals(getFirstName())&& (p.getLastName().equals(getLastName()))) {
				temp[x] = people[i];
				x++;
			}
			System.out.println(people[i].toString());
		}
	}
	public void searchByPhoneNum() {
		System.out.println("Here's the information you requested: ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		int x = 0;
		Person [] temp = new Person[people.length + 1];
		for(int i=0; i < people.length; i++) {
			Person p = people[i];
			if (p.getPhoneNum().equals(getPhoneNum())) {
				temp[x] = people[i];
				x++;
			}
			System.out.println(people[i].toString());
		}
	}
	public void updateByPhoneNum() {
		
	}
	}
		
	
