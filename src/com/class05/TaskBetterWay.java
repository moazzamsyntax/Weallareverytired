package com.class05;

import java.util.Scanner;

public class TaskBetterWay {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int height;
	
		System.out.println("Enter your height");
		height = input.nextInt();
		String definition;
		if (height > 0 && height < 60) {
			definition="short";
		} else if (height >= 60 && height <= 72) {
			definition="medium";
		} else {
			definition="tall";
		} 
		
System.out.println("You are person who's height is "+ definition);

	}

}
