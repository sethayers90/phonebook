package com.claim;

public class Directory {
	Person [] people = new Person[0];
	
	public void addPerson(Person person1) {
		Person [] temp = new Person [people.length + 1];
		for(int i = 0 ; i < people.length + 1; i++) {
			temp[i] = people[i];
		}
		temp[temp.length -1] = person1;
		people = temp;
	}
	public void deletePerson(Person person1) { 
		
		Person [] temp = new Person[people.length -1];
		for(int i = 0; i < people.length - 1; i++) {
			for(int j = 0; j < people.length; j++) {
				if(temp[i] == temp[j]) {
					continue;
				}else {
					temp[temp.length + 1] = person1;
					people = temp;
				}
			}
		}
	}
	public void showList(){
		System.out.println("Here's the information you requested: ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		Person [] temp = new Person[people.length + 1];
		for(int i = 0; i< people.length ; i++) {
			temp[i] = people[i];
			System.out.println(people);
		}
	}
}
