package com.class08;

import java.util.Scanner;

public class WhileReview {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int money=0 ;
		System.out.println("Please pay for soda");
		
		
		while (money!=3) {
			money=input.nextInt();		
			if(money>3) {
				System.out.println("Please give less money");
					}else if(money<3){
						System.out.println("Please give more money");
					}
			
		}
		
		System.out.println("You can take your soda");

	}

}
