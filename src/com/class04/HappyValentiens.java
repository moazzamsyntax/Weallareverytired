package com.class04;

import java.util.Scanner;

public class HappyValentiens {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your name");

		String name = input.next();

		System.out.println("I love you " + name + ". Happy Saint Valentines Day!");

		System.out.println("Do you love your wife?");

		String answ1 = input.next();

		if (answ1.equals("Yes")) {
			System.out.println("She loves you too!");
		}else {System.out.println("Are you sure?");
			
		}
	}		

}
