package com.class04;

public class Task01 {

	public static void main(String[] args) {

		System.out.println("----------Task 1------------");

		boolean diploma = true;
		double gpaScore = 3.5;

		if (diploma) {
			System.out.println("Congratulations - you are lucky person with diploma");
			if (gpaScore >= 3.5) {
				System.out.println("You are eligible for scolarship");
			} else {
				System.out.println("You should have studied harder");
			}
		} else {
			System.out.println("Let's get a degree");
			
		}

		System.out.println("-----------Task 2------------");

		double mortgageRate = 3.5;
		int mortgagePrice = 108000;
		if (mortgageRate <= 4.5) {
			System.out.println("I'll buy this house");
			if (mortgagePrice >= 200000) {
				System.out.println("I will take a loan");
			} else {
				System.out.println("I will pay in cash");
			}
		} else {
			System.out.println("I will noy buy this house");
		}
	}

}
