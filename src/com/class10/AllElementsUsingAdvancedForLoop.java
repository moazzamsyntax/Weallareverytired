package com.class10;

public class AllElementsUsingAdvancedForLoop {

	public static void main(String[] args) {
		
		int[] numbers= {10, 14, 78, 5, 90};
		
		for (int num:numbers) {
			System.out.println(num);
		}
		
		String []javanger= {"Aisha","Aryan","Daryna","Kenza","Mirage", "Safiet","Yara", "Yuliya","Zhanna"};
		
		for (int i=0; i <javanger.length; i++) {
			System.out.println(javanger[i]);
		}
		
		System.out.println("-------------------------");
		
		for (String n:javanger) {
			System.out.println(n);
		}

		System.out.println("---------------------------");
		
		char[]grades= {'A', 'B', 'C', 'D', 'E', 'F'};
		
		for(char c:grades) {
			System.out.print(c+" ");
		}
	}

}
