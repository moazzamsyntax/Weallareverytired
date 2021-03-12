package com.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		

		for (int i=1; i<=10; i++) {
			System.out.println("Hello");
			
			if (i==3) {
			continue;
			}
		}
		
		System.out.println("----------------------------");
		
		/*
		 * we need to print all numbers from 1 to 10 except 5 & 6
		 */
	
		for (int i=1; i<=10;i++) {
			if (i==2||i==6) {
				continue;
			}
			System.out.print(i+" ");
		}
		
		System.out.println(" ");
		System.out.println("-----------------------");
		
		for (int i=1; i<=40; i++) {
			
			if(i%4==0) {
				continue;
			}
			
			System.out.print(i+" ");
		}
	}

}
