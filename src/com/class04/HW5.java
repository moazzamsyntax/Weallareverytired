package com.class04;

import java.util.Scanner;

public class HW5 {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask if user has a credit card or not. 
		 * If you user does not have a credit card then offer them. 
		 * If they do have one ask what is balance on the card? 
		 * If balance of the card is larger than 1000, tell them to pay off immediately, 
		 * otherwise you can tell them that they can spend more.
		 */
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Do you have a credit card? (Yes or No)");
		
		String answ=input.next();
		
		if(answ.equalsIgnoreCase("Yes")) {
			System.out.println("What is the ballance on your card?");
			int bal=input.nextInt();
			if (bal>1000) {
				System.out.println("Pay immediatly!");
			}else {
				System.out.println("You can spend more money!");
			}
		}else {
			System.out.println("You can request a credit card.");
		}
	}

}
