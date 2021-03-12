package com.class08;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		/*
		 * Write a program to ask a user to enter item they want to buy and the price of
		 * that item. Every time user enters money, accumulate the amount and tell the
		 * user how much is left to pay off. If user give more money program should
		 * return a change. Whenever a user done with payments program should say “Thank
		 * you for shopping!”
		 */

		Scanner input = new Scanner(System.in);
		String item;
		int price;
		int money;
		int moreMoney = 0;
		int fullMoney = 0;

		System.out.println("What do you want to buy?");
		item = input.nextLine();
		System.out.println("What is price?");
		price = input.nextInt();
		
		do {
			System.out.println("How much money do you enter?");
			money = input.nextInt();
			fullMoney=money;
			fullMoney+=moreMoney;
			if (money < price) {
				System.out.println("You need pay " + (price - money) + " $ more");
				System.out.println("Enter more money");
				moreMoney = input.nextInt();
				if (fullMoney == price) {
					break;
				}
			} else if (money > price) {
				System.out.println("You exchange is " + (money - price));
				break;
			}
		} while (money != price);

		System.out.println("You can take your " + item);

	}

}
