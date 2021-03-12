package com.class05;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		/* Prompt the user to enter person heights in inches. Person should be
		 * classified as one of the following: short (under 60 inch) medium(between 60
		 * -72 inch) tall (over 72 inch)
		 */
	Scanner input=new Scanner(System.in);
	String name;
	int height;
	System.out.println("Enter your name");
	name=input.next();
	System.out.println("Enter your height");
	height=input.nextInt();
	if(height>0 && height<60) {
		System.out.println(name+" you are short height");
	}else if(height>=60 && height<=72) {
		System.out.println(name+" you are medium height");
	}else if(height>72) {
		System.out.println(name+"you are tall");
	}else {
		System.out.println("Your data is not correct");
	}
	}

}
