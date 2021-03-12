package com.class05;

import java.util.Scanner;

public class LogicalOperatorsEx {

	public static void main(String[] args) {
		/*ask user to enter age
		 * based on the age we will define
		 * if age is from 1 to 3 -> baby
		 * if age is from 3 to 5 -> bigger baby
		 * if age is from 5 to 12 -> kid
		 * if age 13-19 ->teenager
		 * if above 20 -> adult
		 */
	
		Scanner input;
		String name;
		int age;
		System.out.println("Please enter your name");
		input=new Scanner(System.in);
		name=input.next();
		System.out.println("Please enter your age");
		age=input.nextInt();
		
		if(age>=1 && age<=3) {
			System.out.println(name+" your are a baby");
		}else if(age>3 && age<=5) {
			System.out.println(name+" your are a bigger baby");
		}else if(age>5 && age<=12) {
			System.out.println(name+" your are a kid");
		}else if(age>12 && age<=19) {
			System.out.println(name+" your are a teenager");
		}else if(age>19) {
			System.out.println(name+" your are an adult");
		}else {
			System.out.println("Check your age!");
		}
	}

}
