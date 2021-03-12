package com.class05;

import java.util.Scanner;

public class HW01 {

	public static void main(String[] args) {
		
		Scanner input;
		String month, season;

		input = new Scanner(System.in);
		System.out.println("Enter your birthmonth");
		month=input.next();
		if(month.equalsIgnoreCase("December") ||month.equalsIgnoreCase("January")||month.equalsIgnoreCase("February")) {
			season="Winter";
		}else if(month.equalsIgnoreCase("March")||month.equalsIgnoreCase("April")||month.equalsIgnoreCase("May")) {
			season="Spring";
		}else if(month.equalsIgnoreCase("June")||month.equalsIgnoreCase("July")||month.equalsIgnoreCase("August")) {
			season="Summer";
		}else if(month.equalsIgnoreCase("September")||month.equalsIgnoreCase("October")||month.equalsIgnoreCase("November")) {
			season="Fall";
		}else {
			season="Invalid";
		}
		
		System.out.println("You were born in "+season);
	}

}
