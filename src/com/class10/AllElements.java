package com.class10;

public class AllElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]numbers= {10, 14, 78, 5, 90, 76};
		
		for (int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}
		System.out.println();
		System.out.println("---Reverse---");
		
		for (int i=numbers.length-1; i>=0; i--) {
			System.out.print(numbers[i]+" ");
		}
	}

}
