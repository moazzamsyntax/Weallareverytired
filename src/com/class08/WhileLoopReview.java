package com.class08;

import java.util.Scanner;

public class WhileLoopReview {

	public static void main(String[] args) {
		/*we need to make user to pay for a soda
		 * keep asking user to pay you until it enter 3 $
		 * 
		 * if more then 3 --> please give less money
		 * if less then 3 --> please give more money
		 */

		Scanner input=new Scanner(System.in);
		int money;
		
		do {
			System.out.println("Please pay for soda");
			money=input.nextInt();
			if(money>3) {
				System.out.println("Please give less money");
					}else if(money<3){
						System.out.println("Please give more money");
					}
		}while(money!=3); 
		
		System.out.println("You can take your soda");	
	}

}
