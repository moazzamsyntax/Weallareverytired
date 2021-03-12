package com.class02;

public class StringExample {

	public static void main(String[] args) {

		String name;
		name="Yuliya";
		
		String greeting="Good morning";
		String phoneNumber="615-509-2370";
		
		String stringNumber="12";
		
		String wordWithSpace="Hello World";
		
		String letter="A";
		String letter2="A ";
		char oneLetter='A';
		
		//Hello, my name is Yuliya
		
		System.out.println("Hello, my name is "+name);
		
		//How are you Yuliya?
		System.out.println("How are you "+name+"?");
		
		int age=33;
		
		//I am 33
		
		System.out.println("I am "+age);
		
		char grade='A';
		
		//Chris is A student
		
		System.out.println(name + " is " + grade + " student");

		/*
		 * String concatenation operator + can be used when
		 * we attach String to another String
		 * we attach String to a number
		 * we attach String to any character or boolean
		 */
		
		String car="Tesla";
		int year=2021;
		
		//I drive 2021 Tesla
		
		System.out.println("I drive "+year+" "+car);
		
		String laptop="HP";
		int memory=256;
		
		//Yuliya has HP with 256 GB memory
		
		System.out.println(name+" has "+laptop+" with "+memory+ " GB memory");
	
		String combinedValue=year+" "+car; //2021 Tesla
		System.out.println(combinedValue);
		
		int day=7;
		String month="February ";
		
		String date=month+day;
		System.out.println(date);
		
	
	}

}
