package com.class11;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		/*
		 * Write a java program to check whether a given number is prime or not?
		 */

		Scanner scan=new Scanner(System.in);
		int [] numbers;
		System.out.println("How many numbers do you want to type?");
		int size=scan.nextInt();
		
		numbers=new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Type your number");
			numbers[i]=scan.nextInt();
			if (numbers[i]%1!=0 && numbers[i]%numbers[i]!=0) {
				System.out.println("The typed number "+numbers[i]+" is not prime number");
			}else {
				System.out.println("The typed number "+numbers[i]+" is prime number");
				}
		}
	}

}
