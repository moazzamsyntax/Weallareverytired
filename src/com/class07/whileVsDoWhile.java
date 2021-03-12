package com.class07;

public class whileVsDoWhile {

	public static void main(String[] args) {

		int num=1;
		
		while (num<=5) {
			System.out.println("Hello");
			num++;
		}
		
		System.out.println("---------------------");
		
		int num1=1;
		do {
			System.out.println("Buy");
			num1++;
		} while (num1<=5);
	

	}

}
