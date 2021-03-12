package com.class02;

public class ArithmeticOperators {

	public static void main(String[] args) {


		int num1=10;
		int num2=5;
		
		//+, *, /, -, %
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		
		int sum=num1+num2;
		int sub=num1-num2;
		int mult=num1*num2;
		int div=num1/num2;
		
		System.out.println("sum of "+num1+" and "+num2+" is "+sum);
		
		double number1=10.99;
		double number2=90.99;
		
		double sumOfDouble=number1+number2;
		double subOfDouble=number1-number2;
		double divOfDouble=number2/number1;
		
		System.out.println("Result of division of 2 double values "+divOfDouble);

		
	}

}

