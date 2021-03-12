package com.groupproject01;

public class Task05 {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable?
		
		int x = 10;
        int y = 5;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swaping: x = " + x + ", y = " + y);

	}

}
