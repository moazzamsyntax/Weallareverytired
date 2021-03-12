package com.class06;

import java.util.Scanner;

public class SwitchStringExample {
	public static void main(String[] args) {
			
		 /* we need to identify favorite food
		 * 
		 * we need to capture country from a user
		 * based on the country identify favorite food
		 */

		Scanner input;
		String country, food;
		
		input=new Scanner(System.in);
		
		System.out.println("Please enter your country");
		country=input.nextLine();
		
		switch(country.toLowerCase()) {
		case "usa":
			food="Burger";
			break;
		case "Afganistan":
			food="Kebab";
			break;
		case "Vietnam":
			food="Pho";
			break;
		case "Poland":
			food="Pierogi";
			break;
		case "Kazakstan":
			food="Kumys";
			break;
		case "Belarus":
			food="Draniki";
			break;
		case "Tajikistan":
			food="Plov";
			break;
		case "Mexico":
			food="Tacos";
			break;
		default:
			food="Unknown";
		}
		
		System.out.println("Favorite food in "+country+" is "+food);
	}

}
