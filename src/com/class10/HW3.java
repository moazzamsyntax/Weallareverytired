package com.class10;

public class HW3 {

	public static void main(String[] args) {

		/*
		 * Create an array on integers and calculate the sum of all elements in an
		 * array.
		 */

		int[] num = { 1, 25, 36, 89, 48, 2658 };
		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println(sum);

		System.out.println("-------------------");

		int sum1 = 0;
		for (int n : num) {
			sum1 += n;
		}
		System.out.println(sum1);

	}

}
