package com.groupproject01;

public class Task09 {

	public static void main(String[] args) {
		/*
		 * Write a java program to find the second largest number in the array?
		 */

		
		int array[] = { -10, 20, 25, -6300, -960, 57 };
		
		int large=array[0], secondLarge=array[0];
		
		for (int i = 0; i < array.length; i++) {
			
				if (array[i] > large) {
					secondLarge=large;
					large=array[i];
				}else if(array[i] > secondLarge){
					secondLarge=array[i];
				}
			}
		System.out.println("Second largest number is "+secondLarge);
		}
		
		
	}

