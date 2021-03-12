package com.class04;

public class NestedIfFun {

	public static void main(String[] args) {
		
		/* to donate:
		 * you must be 18 and older. otherwise you cannot
		 * you weight must be more than 110 lbs, otherwise cannot donate
		 */

		int age=18;
		int weight=80;
		
		if(age>=18) {
			System.out.println("Your age is ok for donation. Let's check your weight.");
			if(weight>=110) {
				System.out.println("Your weight is ok for donation.");
			}else {
				System.out.println("Your weight is too low - you cannot donate.");
			}
		}else {
			System.out.println("You are not aligable to donate.");
		}
	}

}
