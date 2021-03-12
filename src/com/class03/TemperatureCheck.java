package com.class03;

public class TemperatureCheck {

	public static void main(String[] args) {

		int t = 55;

		if (t < 32) {
			System.out.println("Water will freeze with temperature " + t);
			System.out.println("It's very cold");
		} else {
			System.out.println("Water will NOT freeze with temperature " + t);
			System.out.println("It's warm");
		}
		
		double money=10;
		double $coke=3;
		
		if(money==$coke) {
			System.out.println("I am buying soda");
		}else {
			System.out.println("I need extra money");
		}
		
		System.out.println("------------------");
		
		boolean snow=false;
		
		if(snow) {
			System.out.println("yay, I will play with the snow");
		}else {
			System.out.println("I am going to ride my bicycle");
		}
		
		System.out.println("------------------");
		
		boolean summer=true;
		
		if(summer) {
			System.out.println("I am going to Florida");
		}else {
			System.out.println("I'll stay at home");
		}
	}

	}
