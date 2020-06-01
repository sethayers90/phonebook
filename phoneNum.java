package com.claim;
/*
 * This needs a method to seperate the phone number i.e. 2604400664 = (260)440-0664
 * Also maybe this doesn't go here, I'm not sure yet. Add a method to search by phone number
 */
public class phoneNum {
	private String phoneNum; //I'm making this a string so that I can split it
	
	public String getPhoneNum(){
		return this.phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public static String newPhoneNum(String phoneNum) {
		String firstThree = phoneNum.substring(0, 2);
		String secondThree = phoneNum.substring(3, 5);
		String lastFour = phoneNum.substring(6,9);
		
		String newNum = "(" + firstThree + ")" + secondThree + "-" + lastFour;
		return newNum;
	}
}
