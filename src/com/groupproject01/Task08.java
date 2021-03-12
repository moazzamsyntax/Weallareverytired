package com.groupproject01;

public class Task08 {

	public static void main(String[] args) {
		// Maximum and minimum number in the array?

		int[] largeArray = { 1, 564, 7894, 15216, 41161, -51651651 };
		int smallest=largeArray[0];
		int largest=largeArray[0];
		
		for(int i=0; i<largeArray.length; i++) {
			if(largeArray[i]<smallest) {
				smallest=largeArray[i];
			}else {
				largest=largeArray[i];
			}
		}
		
		System.out.println(smallest+" is minimum number in the array");
		System.out.println(largest+" is maximum number in the array");
		
	}
}
