package com.class04;

import java.util.Scanner;

public class HW6 {

	public static void main(String[] args) {
		/*
		 * Write a program to ask user to enter numbers of worked years and annual salary. 
		 * If user worked for more or equals to 5 years than user is eligible for the bonus, otherwise he is not. 
		 * Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of worked years in our company!");
		
		double years=input.nextDouble();
		
		System.out.println("Enter your annual salary!");
		
		int salary=input.nextInt();
		
		if(years>=5) {
			System.out.println("You are eligible for the bonus.");
			if(salary>=5000) {
				System.out.println("Your bonus is equal to 5000.");
			}else {
				System.out.println("Your bonus is equal to 3000.");
			}
		}else {
			System.out.println("You are not eligible for the bonus.");
		}
	}

}
