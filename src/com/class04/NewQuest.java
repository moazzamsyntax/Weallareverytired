package com.class04;

import java.util.Scanner;

public class NewQuest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hi! What is your name?");
		
		String answ1=input.next();
		
		System.out.println("Nice to meet you "+answ1+"! How are you?");
		
		String answ2=input.next();
		
		System.out.println("How old are you?");
		
		int answ3=input.nextInt();
		
		if (answ3>33) {
			System.out.println("I'm 33. You are elder than I.");
		}else if(answ3<33) {
			System.out.println("You are younger than I.");
		}else {
			System.out.println("You are my peer.");
		}
		
		System.out.println("Are you married?");
		String answ4=input.next();
		
		if(answ4.equals("Yes")) {
			System.out.println("What is her/his name?");
		}else {
			System.out.println("Do you have a girlfriend?");
		}
		String answ5=input.next();
		
		System.out.println("You are lucky person "+answ1);

}

}
