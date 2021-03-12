package com.class11;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {


		Scanner input=new Scanner(System.in);
		int size;
		double [] nums;
		double sum = 0;
		
		System.out.println("How many doubles do you want to print out?");
		size=input.nextInt();
		
		nums=new double[size];
		
		for (int i=0; i<size; i++) {
			System.out.println("Please enter a double");
			nums[i]=input.nextDouble();
			sum+=nums[i];
		}
		System.out.println("Sum of entered doubles is equals to "+sum);
		

	}

}
