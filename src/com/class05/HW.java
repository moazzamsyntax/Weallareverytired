package com.class05;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		// Write a program to find largest of three double values using if-else..
		//if and logical operators provided by a user (numbers must be distinct)

		Scanner input;
		double a, b, c;
		
		input=new Scanner(System.in);
		
		System.out.println("Enter your first number");
		a=input.nextDouble();
		System.out.println("Enter your second number");
		b=input.nextDouble();
		System.out.println("Enter your third number");
		c=input.nextDouble();
		
		if(a>b && a>c) {
			System.out.println(a+" is the largest number");
		}else if(b>c && b>a){
			System.out.println(b+" is the largest number");
		}else {
			System.out.println(c+" is the largest number");
			}
	}

}
