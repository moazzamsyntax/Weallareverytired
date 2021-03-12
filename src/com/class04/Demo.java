package com.class04;

import java.util.Scanner; //shortcut ctrl+shift+o

public class Demo {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		String text=scan.nextLine(); //for full line
		
		System.out.println("Text that I entered is - " + text);
		
		System.out.println("Please enter you name");
		
		String name=scan.next( ); //captures one word
		
		System.out.println("Nice to meet yo "+name);
		
		System.out.println("Please enter your age!");
		
		int age=scan.nextInt(); //captures integer
		
		System.out.println("My name is "+name+" I am "+age+" years old.");

	}

}
