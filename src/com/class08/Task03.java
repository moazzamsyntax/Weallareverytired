package com.class08;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// Write a program that reads a range of integers (start and end point), 
		//provided by a user and then from that range prints the sum of the even and odd integers.
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter start number");
		int start=input.nextInt();
		System.out.println("Please enter end number");
		int end=input.nextInt();
		
		int sumOdd=0;
		int sumEven=0;
		
		for(int i=start; i<=end; i++) {
			if(i%2!=0) {
				sumOdd+=i;
			}else {
				sumEven+=i;
			}
		}
			System.out.println(sumOdd);
			System.out.println(sumEven);
		
		
	}
	}

