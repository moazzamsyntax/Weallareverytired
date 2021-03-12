package com.class04;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		/*
		 * 2. You are DMV representative and you need to ask customer their age. 
		 * If they are 18 and older you will issue a driver license to them, otherwise you will offer them to get a learners permit.
		 */

		System.out.println("How old are you?");
		Scanner input = new Scanner(System.in);
		int age=input.nextInt();
		
		if(age>=18) {
			System.out.println("Your driver license will be issued.");
		}else {
			System.out.println("You'll get a lerners permit.");
		}
	}

}
