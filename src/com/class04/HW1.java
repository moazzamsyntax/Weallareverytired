package com.class04;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		/*
		 * 1. You are a loan specialist and you need to ask user what is the amount of loan is needed. 
		 * If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
		 */

		System.out.println("What is the amount of loan you need?");
		Scanner input = new Scanner(System.in);
		int loan=input.nextInt();
		
		if(loan<=200000) {
			System.out.println("I will lend the money.");
		}else {
			System.out.println("Loan is rejected.");
		}
	}

}
