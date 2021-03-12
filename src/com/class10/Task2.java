package com.class10;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create an array of names and store all names of your group. 
		 * Then print your name from that array. 
		 * (use 2 different ways of creating an array).
		 */

		String[] javangers=new String[9];
		
		javangers[0]="Aisha";
		javangers[1]="Aryan";
		javangers[2]="Daryna";
		javangers[3]="Kenza";
		javangers[4]="Mirage";
		javangers[5]="Safiet";
		javangers[6]="Yara";
		javangers[7]="Yuliya";
		javangers[8]="Zhanna";
		
		System.out.println(javangers[7]);
		
		System.out.println("-----2-----");
		
		String []javanger= {"Aisha","Aryan","Daryna","Kenza","Mirage", "Safiet","Yara", "Yuliya","Zhanna"};
		
		System.out.println(javanger[7]);
		
		System.out.println("---- How to print all ----");
		
		for (int i=0; i<javanger.length; i++) {
			System.out.println(javangers[i]);
		}
	}

}
