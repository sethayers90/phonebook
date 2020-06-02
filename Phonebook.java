package com.claim;

import java.util.Scanner;

public class Phonebook {
	// Directory directory = new Directory();
	public static void getMenu(Directory directory) {

		Scanner input = new Scanner(System.in);
		Scanner usrInput = new Scanner(System.in);
		int selection = 0;
		String temp = null;
		String temp1 = null;

		while (selection != 7) {

			System.out.println("Welcome to my phone book! Please enter a number based on what you would like to do!\n"
					+ "1.Add a new record\n" + "2.Delete a record\n" + "3.Search by first name\n"
					+ "4.Search by last name\n" + "5.Update a record\n" + "6.Show all phonebook entries\n" + "7.Exit");
			selection = input.nextInt();
			switch (selection) {
			case 1:
				System.out.println("Enter all the information for the record you'd like to add"
						+ " eg. John Michael West Doe, 574 Pole ave, St. Peters, MO, 63333, 5628592375");
				
				String people = usrInput.nextLine();
				
				// Splitting it up at the commas
				String newPerson[] = people.split(",");
				String name = newPerson[0];
				String addressName = newPerson[1];
				String city = newPerson[2];
				String state = newPerson[3];
				String zip = newPerson[4];
				String phoneNum1 = newPerson[5];
				
				// Splitting it up at the spaces				
				String splitFirst[] = name.split(" ");

				// Sets the name			
				String firstName = splitFirst[0];
				String lastName = splitFirst[splitFirst.length - 1];
				String middleName1 = splitFirst[1];
				String middleName2 = splitFirst[2];
				
				//Making address one object
				String address = addressName + " " + city + " " + state + " " + zip;
				
				//Separating the phone number out
				String firstThree =  phoneNum1.substring(1, 4);
				String secondThree = phoneNum1.substring(4, 7);
				String lastNum = phoneNum1.substring(7, 11);
				
				//Put the phone number together
				String phoneNum = "(" + firstThree + ")" + secondThree + "-" + lastNum;
				
				//Creates the Person				
				Person donePerson = new Person(firstName, middleName1, lastName, address, phoneNum);
				Person donePerson1 = new Person(firstName, middleName1, middleName2, address, phoneNum);
				
				//Adds the person to the directory
				directory.addPerson(donePerson);
				directory.addPerson(donePerson1);
				break;
			case 2:
				System.out.println("Please enter the phone number you'd like to delete");
				String person2 = input.next();
				break;
			case 3:
				System.out.println("Please enter the first name");
				String person3 = input.next();

				break;

			case 4:
				System.out.println("Please enter the last name");
				String person4 = input.next();

				break;
			case 5:
				System.out.println("Please enter the phone number you'd like to update");
				String person5 = input.next();
				break;
			case 6:
				//directory.showList();
				break;
			case 7:
				break;

			}

		}
	}

}
