package com.class11;

public class Task4 {

	public static void main(String[] args) {
		
		/*
		 * Create 2D array of cars : american, german, korean, italian. 
		 * Then retrieve all values from that array using 2 different loops
		 */

		String[][]cars= {
				{"Ford", "Chevrolet", "Chrysler", "Dodge"},
				{"Audi", "BMW", "Volkswagen", "Porsche"},
				{"Kia", "Hyundai"},
				{"Fiat", "Maserati", "Lamborghini", "Alfa Romeo"}
		};
		
		for (int i=0; i<cars.length; i++) {
			for (int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("-------------------");
		
		for (String[]car:cars) {
			for (String c:car) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}

}
