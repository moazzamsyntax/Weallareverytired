package com.groupproject01;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?
		
		Scanner scan= new Scanner(System.in);
		
		boolean isPrime=true;
		System.out.println("Enter any number:");
		int num=scan.nextInt();
		
		if (num>1) {
		for (int i=2; i<num; i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}
		}else {
			isPrime=false;
		}
		
		if(isPrime) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is not a prime number");
		}
		}
	   
}
	
	
	



