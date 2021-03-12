package com.class07;

public class Task01 {
	public static void main(String[] args) {
		//Print numbers from 1 to 100 in 1 line with space
			for (int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}
			System.out.println(" ");
			//Print numbers from 100 to 1
			
			for (int n=100; n>=1; n--) {
				System.out.print(n+" ");
			}
			
			System.out.println(" ");
			//Print even numbers from 20 to 1 (2 ways)
			for (int a=20; a>=0; a-=2) {
				System.out.print(a+" ");
			}
			
			System.out.println(" ");
			
			for (int b=0; b<=20; b+=2) {
				System.out.print(b+" ");
			}
			
			System.out.println(" ");
			//Print odd numbers between 20 and 50 (2 ways)
			
			for(int c=21; c<=50; c+=2) {
				System.out.print(c+" ");
			}
			System.out.println(" ");
			
			for(int d=49; d>20; d-=2) {
				System.out.print(d+" ");
			}
			
	}

}
