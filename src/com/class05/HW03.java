package com.class05;

import java.util.Scanner;

public class HW03 {

	public static void main(String[] args) {
	
		Scanner input;
		double a, b, c, largestNumber;
		input=new Scanner(System.in);
		largestNumber=0;
		
		System.out.println("Enter three different numbers");
		a=input.nextDouble();
		b=input.nextDouble();
		c=input.nextDouble();
		
		if(a>b) {
			if(a>c) {
				largestNumber=a;
			}
		}else if (b>c){
			if(b>a) {
				largestNumber=b;
			}
		}else {
			largestNumber=c;
		}
		
		System.out.println(largestNumber+" is the largest number");
	
	}

}
