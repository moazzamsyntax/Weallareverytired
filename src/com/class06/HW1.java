package com.class06;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		
		/*
		 * Ask user to enter their country and capture it. 
		 * Once values are captured print which language user speaks.
		 */

		Scanner input;
		String country, language;
		input=new Scanner(System.in);
		System.out.println("Where you from?");
		country=input.nextLine();
		
		switch (country.toLowerCase()) {
		case "france":
			language="French";
			break;
		case "italy":
			language="Italian";
			break;
		case "germany":
			language="German";
			break;
		case "austria":
			language="German";
			break;
		case "switzerland":
			language="German or French or Italien";
			break;
		case "spain":
			language="Spanish";
			break;
		case "portugal":
			language="Portugiesish";
			break;
		case "danemark":
			language="Danish";
			break;
		case "poland":
			language="Polish";
			break;
		case "ukraine":
			language="Ukrainian";
			break;
		case "belarus":
			language="Belarussian or Russian";
			break;
		case "russia":
			language="Russian";
			break;
		case "china":
			language="Chinese";
			break;
		case "japan":
			language="Japanish";
			break;
		case "usa":
			language="English or Spanish";
			break;
		case "great britain":
			language="English";
			break;
		case "iran":
			language="Percian";
			break;
		default:
			language="I need check in Google";
		}
		
			System.out.println("If you are from "+country+", you speak "+language);
		
		
		
	}

}
