package com.claim;

import java.util.Scanner;

public class Phonebook {

	public static void main(String[] args) {

		System.out.println("Welcome to my phone book! Please enter a number based on what you would like to do!\n"
				+ "1.Add a new record\n" + "2.Delete a record\n" + "3.Search by first name\n"
				+ "4.Search by last name\n" + "5.Update a record\n" + "6.Show all phonebook entries\n" + "7.Exit");
		Scanner input = new Scanner(System.in);
		int userInput = 0;

		while (userInput != 7) {
			 userInput = input.nextInt();
			if (userInput == 1) {
				System.out.println("Enter all the information for the record you'd like to add"
						+ " eg. John Michael West Doe, 574 Pole ave, St. Peters, MO, 63333, 5628592375");

				

			} else if (userInput == 2) {
				System.out.println("Please enter the phone number you'd like to delete");

			} else if (userInput == 3) {

			} else if (userInput == 4) {
				System.out.println("Please enter the last name");

			} else if (userInput == 5) {
				System.out.println("Please enter the phone number you'd like to update");

			} else if (userInput == 6) {
				System.out.println("Here are your results");
				continue;
			} else {
				break;
			}

		}
	}
}