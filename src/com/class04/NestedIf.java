package com.class04;

public class NestedIf {

	public static void main(String[] args) {

		boolean morning = true;

		boolean classToday = false;

		// is it morning? --> Good morning
		// if there is class today; yes---> hello classmates
		// other wise ---> hello my family

		if (morning) {
			System.out.println("Let me check if I have class today");

			if (classToday) {
				System.out.println("Hello Classmates");
			} else {
				System.out.println("Hello Family");
			}
		}

		System.out.println("---------Ex 2---------");

		boolean anyAllergy = true;

		boolean pollenAllergy = false;

		if (anyAllergy) {
			
			System.out.println("Let's check wich allergies you have");
			
			if (pollenAllergy) {
				
				System.out.println("Don't get close to trees");
				
			} else {
				
				System.out.println("Ok I know you dont have pollen allergy");
			}
		} else {
			
			System.out.println("You are lucky not having any allergies");
		}
		
		
	}

}
