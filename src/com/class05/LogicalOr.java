package com.class05;

public class LogicalOr {

	public static void main(String[] args) {

		/*
		 * variable day if day is Tuesday or Wednesday --> manual class if Monday or
		 * Friday --> no class if Saturday or Sunday --> Java class if Thursday -->
		 * Review Class
		 */

		String day = "Wednesday";

		if (day.equals("Monday") || day.equals("Friday")) {
			System.out.println("Today is no class.");
		} else if (day.equals("Tuesday") || day.equals("Wednesday")) {
			System.out.println("Today is Manual class");
		} else if (day.equals("Thursday")) {
			System.out.println("Today is Review class");
		} else if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("Today is Java class");
		} else {
			System.out.println("Not valid");
		}
	}
}
