package com.groupproject01;

public class Task04 {

	public static void main(String[] args) {
		/*Create 2D array of countries: 
		 * north america countries, south america countries, europe countries, asian countries, african countries. 
		 * Then print all values from that array using 2 different loops and calculate how many total countries have been stored.
		 * 
		 */

		String[][] country= {
				{"USA", "Kanada", "Mexico"},
				{"Brazil", "Argentina", "Chile", "Peru", },
				{"France", "Italy", "Spain", "Germany"},
				{"Egypt", "Nigeria", "Tanzania"}
		};
		
		for (int i=0; i<country.length; i++) {
			for (int j=0; j<country[i].length; j++) {
				System.out.print(country[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		
		for (String[] count:country) {
			for (String c:count) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
		int number=country.length+country[1].length+country[2].length+country[3].length;
		
		System.out.println("---------------------");
		
		System.out.println("In this array were stored "+number+" countries.");
	}

}
