package com.class08;

import java.util.Scanner;

public class checking {

	public static void main(String[] args) {
		Scanner inp;
		String product;
		int price, money;
		inp = new Scanner(System.in);
		
		System.out.println("Pls enter your product and price");
		product = inp.nextLine();
		price = inp.nextInt();
		System.out.println("Pls pay for " + product + " "  + price + " dollars");
		do {
			money = inp.nextInt();
			if (price < money) {
				System.out.println("Pls give less money on " + (money - price) + " dollars");
			} else if (price > money) {
				System.out.println("pls give more money on " + (price - money) + " dollars");
			}
		} while (money != price);
		System.out.println("Thank you for shopping!");
	}

}
