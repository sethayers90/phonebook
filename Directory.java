package com.claim;

import java.util.Arrays;

import java.util.Scanner;

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
		String[] temp1 = new String[people.length];
		Person[] temp = new Person[people.length + 1];
		for (int i = 0; i < people.length; i++) {

			temp1[i] = people[i].getLastName();

		}
		Arrays.sort(temp1);
		for (int j = 0; j < temp1.length; j++) {
			for (int l = 0; l < people.length; l++) {
				if (temp1[j] == people[l].getLastName()) {
					System.out.println(people[l].toString());
				}
			}
		}
	}

	public void searchByFull() {
		System.out.println("Here's the information you requested: ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		int x = 0;
		Person[] temp = new Person[people.length + 1];
		for (int i = 0; i < people.length; i++) {
			Person p = people[i];
			if (p.getFirstName().equals(getFirstName()))  {
				if(p.getLastName().equals(getLastName())) {
					
			
				temp[x] = people[i];
				x++;
				}
			}
			System.out.println(people[i].toString());
		}
	}

	public void searchByPhoneNum() {
		System.out.println("Here's the information you requested: ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		int x = 0;
		Person[] temp = new Person[people.length + 1];
		for (int i = 0; i < people.length; i++) {
			Person p = people[i];
			if (p.getPhoneNum().equals(getPhoneNum())) {
				temp[x] = people[i];
				x++;
			}
			System.out.println(people[i].toString());
		}
	}

	public void updateByPhoneNum() {
		System.out.println("Please select from the menu below what you'd like to update\n" +  "1.Update the first name\n" + "2.Update the last name\n" 
				+ "3.Update the phone number");
				
		Scanner usrInput = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		int selection = usrInput.nextInt();
		
		switch (selection) {
		
		case 1: 
			Person[]temp = new Person[people.length];
			System.out.println("Please enter the persons phone number");
			String newSelection = input.next();
			System.out.println("Please enter the new first name");
			String newFirst = usrInput.next();
			for(int i =0; i<people.length; i++) {
				Person p = people[i];
				
				if(p.getPhoneNum().equals(newSelection));
				p.setFirstName(newFirst);
				
			}
			
			
			
		
			
			break;
		case 2:
			Person[] temp1 = new Person[people.length];
			System.out.println("Please enter the persons phone number");
			String newSelection1 = input.next();
			System.out.println("Please enter the new last name");
			String newLast = usrInput.next();
			for(int i =0; i<people.length; i++) {
				Person p = people[i];
				
				if(p.getPhoneNum().equals(newSelection1));
				p.setLastName(newLast);
				
			}
			
			break;
		case 3: 
			Person[] temp2 = new Person[people.length];
			System.out.println("Please enter the persons phone number");
			String newSelection2 = input.next();
			System.out.println("Please enter the new phone number");
			String newPhoneNum = usrInput.next();
			for(int i =0; i<people.length; i++) {
				Person p = people[i];
				
				if(p.getPhoneNum().equals(newSelection2));
				p.setPhoneNum(newPhoneNum);
				
			}
			break;
		}
	}
}
