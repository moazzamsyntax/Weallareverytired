package com.class10;

public class HW1 {

	public static void main(String[] args) {
		/*
		 * Create an array of cars and store 6 elements into it. 
		 * Using 2 different loops print all values from the array.
		 */

		String [] cars= {"BMW", "Audi", "Infinity", "Lexus", "Acura"};
		
		for (int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		System.out.println("------------ Var 2 -------------");
		
		for (String c:cars) {
			System.out.println(c);
		}
	}

}
