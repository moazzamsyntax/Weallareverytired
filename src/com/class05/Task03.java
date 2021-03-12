package com.class05;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		/* Write a program that will read three inputs of scores (quiz, mid term, and
		 * final scores) and determine the grade based on the following rules: 
		 * 
		 * if the average score >=90 → grade=A 
		 * if the average score >= 70 and <90 → grade=B 
		 * if the average score>=50 and <70 → grade=C if the average score<50 → grade=F
		 */
	
		Scanner input;
		int quiz,midTerm, finaly, gpa;
		char grade;
		input=new Scanner(System.in);
		
		System.out.println("Enter your quiz");
		quiz=input.nextInt();
		System.out.println("Enter your score");
		finaly=input.nextInt();
		System.out.println("Enter your midTerm");
		
		midTerm=input.nextInt();
		
		gpa=(quiz+midTerm+finaly)/3;
		
		if(gpa>=90) {
			grade='A';
		}else if(gpa>=70 && gpa<90) {
			grade='B';
		}else if(gpa>=50 && gpa<70) {
			grade='C';
		}else {
			grade='F';
		}
		
		System.out.println("Your grade is "+grade);
	}

}
