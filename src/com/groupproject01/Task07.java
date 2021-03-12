package com.groupproject01;

public class Task07 {

	public static void main(String[] args) {
		// Write a Java Program to print the first 10 numbers of Fibonacci series.

		int n1 = 0, n2 = 1, n3, i, count = 100;
	
		for (i = 1; i<=12; ++i)// loop starts from 2 because 0 and 1 are already printed
		{
			System.out.print(n1+" ");
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
	}

}
