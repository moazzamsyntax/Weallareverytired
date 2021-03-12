package com.class11;

public class Task5 {

	public static void main(String[] args) {
		/*
		 * Using 2D array create a grocery list.
Inside you should have an array of veggies, fruits, dairy and sweets. 
Retrieve all values from that array using 2 different loops

		 */

		String[][]grocery= {
				{"cucumbers", "tomatos", "beets", "potatoes", "microgreen"},
				{"bananas", "oranges", "limes", "apples"},
				{"milk", "chees", "butter"},
				{"honey", "chocolate", "bonbons"}
		};
		
		for (int i=0; i<grocery.length; i++) {
			for (int j=0; j<grocery[i].length; j++) {
				System.out.print(grocery[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("------------------");
		
		for (String []gro:grocery) {
			for (String g:gro) {
				System.out.print(g+" ");
			}
			System.out.println();
		}
	}

}
