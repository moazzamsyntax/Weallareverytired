package com.class03;

public class Casting {

	public static void main(String[] args) {
		
		// int i=10.99; type mismatch
		
		double d=10; //widening
		System.out.println(d);
		
		int num=10;
		
		int i=(int)10.99;//narrowing
		System.out.println(i);
		
		byte b=(byte)130;
		System.out.println(b);
		
		int number=12;
		double result=number/=5;
		
		System.out.println(result);
		
		double newNum=10;
		newNum=newNum/3;
		
		System.out.println(newNum);
		
		int num1=10+(int)10.5;
		
		System.out.println(num1);
		
		byte l=(byte)135;
		System.out.println(l);
	}

}
