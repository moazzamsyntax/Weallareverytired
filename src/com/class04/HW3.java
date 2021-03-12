package com.class04;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		/*
		 * 3. Create a Java program that will ask user to input city and temperature. 
		 * Your program should convert Fahrenheit into celsius and print “The temperature is the city __ is __”
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("What is the name of your city?");
		
		String city=input.nextLine();
		
		System.out.println("What is the temperature in °F in your city?");
		
		int tempF=input.nextInt();
		
		float tempC=(tempF-32)/1.8f;
		
		System.out.println("The temperature in the city "+city+" is "+tempC+" °C.");
		
		
	}

}
