package com.class06;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		/*
		 * we need to calculate final price after the discount
		 * we need to check if the is sale
		 * if no sale ---> no shopping
		 * otherwise ---> we need to ask the time and the price
		 * 
		 * if the price is less then 10 $ then apply  5 % discount
		 * if the price is btw 10 - 100 $ then apply  10 % discount
		 * if the price is btw 101 - 500 $ then apply  20 % discount
		 * if the price is more then 500 $ then apply  50 % discount
		 */

		Scanner input;
		String sale, item;
		double price, finalPrice;
		input=new Scanner(System.in);
		System.out.println("Do you have a sale now?");
		sale=input.next();
		if(!sale.equalsIgnoreCase("Yes")) {
			System.out.println("I'm not going to do any shopping today");
		}else {
			System.out.println("Do you have this new sneakers on sale?");
			item=input.next();
			if(!item.equalsIgnoreCase("Yes")) {
				System.out.println("I'm not going to do any shopping today");
			}else {
				System.out.println("What is price?");
				price=input.nextDouble();
				System.out.println("What will be my price with discount?");
				if(price<=10) {
					finalPrice=price-price*0.05;
				}else if(price>10 && price<=100) {
					finalPrice=price-price*0.1;
				}else if(price>100 && price<=500) {
					finalPrice=price-price*0.2;
				}else {
					finalPrice=price-price*0.3;
				}
				
				System.out.println("Final price is "+finalPrice);
			}
			
		}
	}

}
