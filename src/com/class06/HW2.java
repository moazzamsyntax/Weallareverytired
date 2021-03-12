package com.class06;

import java.util.Scanner;

public class HW2 {
	public static void main(String[] args) {
		/*
		 * Allow user to enter grade (A, B, or C etc...) and then provide explanation: 
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
		 * At the end your program should print which grade was entered by a user with explanation.
		 */

		Scanner input;
		char grade;
		String gradeEx;
		input=new Scanner(System.in);
		System.out.println("Enter your grade");
		grade=input.next().charAt(0);
		
		switch(grade) {
		case 'A':
			gradeEx="excellent";
			break;
		case 'B':
			gradeEx="good";
			break;
		case 'C':
			gradeEx="average";
			break;
		case 'D':
			gradeEx="bad";
			break;
		default:
			gradeEx="zero";
		}
		
		System.out.println("If you grade is "+grade+" you have "+gradeEx+" result");
		
		
	}

}
