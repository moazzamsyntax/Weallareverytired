package com.class08;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		/*Create a program that will keep asking user to apply for a credit card. 
		 * As soon you get “yes” from a user program should stop asking.
		 */
		
		Scanner input=new Scanner(System.in);
		String answer;
		
	do {
		System.out.println("Do you want to apply for a credit card?");
		answer=input.next();
		continue;
	}
		while (!answer.equalsIgnoreCase("Yes"));
		
	System.out.println("Your credit card will be applyed right now");	

	}

}
