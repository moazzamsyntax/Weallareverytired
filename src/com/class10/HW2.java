package com.class10;

public class HW2 {

	public static void main(String[] args) {
		/*
		 * Create an array of animals and store 6 elements into it. Using 2 different
		 * loops print all elements from the array.
		 */

		String[] animal = { "lion", "tiger", "cat", "panther", "jaguar", "leopard" };

		for (int i = 0; i < animal.length; i++) {
			System.out.println(animal[i]);
		}

		System.out.println("-------------------------------");

		for (String anim : animal) {
			System.out.println(anim);
		}
	}
}
