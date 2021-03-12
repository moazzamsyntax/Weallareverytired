package com.class03;

public class IfElseIf {

	public static void main(String[] args) {

		double a = 3;
		double b = 19;

		if (a > b) {
			System.out.println("a is larger than b");
		} else if (b > a) {
			System.out.println("b is larger than a");
		} else {
			System.out.println("a is equal to b");
		}

		System.out.println("----------------------");

		// 2. based on the day number define a day

		int day = 10;

		if (day == 1) {
			System.out.println("Today is Monday");
		} else if (day == 2) {
			System.out.println("Today is Tuesday");
		} else if (day == 3) {
			System.out.println("Today is Wednesday");
		} else if (day == 4) {
			System.out.println("Today is Thursday");
		} else if (day == 5) {
			System.out.println("Today is Friday");
		} else if (day == 6) {
			System.out.println("Today is Saturday");
		} else if (day == 7) {
			System.out.println("Today is Sunday");
		} else {
			System.out.println("You can use only numbers 1 to 7");
		}

	}
}
