package com.class07;

public class Task {

	public static void main(String[] args) {

		//Print numbers from 1 to 100 in 1 line with space
		
		int num=1;
		
		while(num<=100) {
			System.out.print(num+" ");
			num++;
		}
		
		System.out.println("Next task");
		//Print numbers from 100 to 1
		int b=100;
		while (b>=1) {
			System.out.print(b+" ");
			b--;
		}
		System.out.println("Next task");
		
		//Print even numbers from 20 to 100
		int e=20;
		
		while (e<=100) {
				System.out.print(e+" ");
				e+=2;
			
		}
		
		System.out.println(" ");

		
		int y=20;
		
		while (y<=100) {
			if (y%2==0){
				System.out.print(y+" ");
				}
			
			y++;
		}
				
	}

	}


