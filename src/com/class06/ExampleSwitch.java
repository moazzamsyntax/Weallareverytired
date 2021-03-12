package com.class06;

public class ExampleSwitch {
	public static void main(String[] args) {

		/*
		 * store gender inside M or F based on the gender we will specify if M - Male if
		 * F - Female otherwise we dont know
		 * 
		 */

		char gender = 'F';
		String description;

		switch (gender) {
		case 'F':
			description = "Female";
			break;
		case 'M':
			description = "Male";
			break;
		default:
			description="N/A";
		}
	}

}
