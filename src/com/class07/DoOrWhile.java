package com.class07;

import java.util.Scanner;

public class DoOrWhile {

	public static void main(String[] args) {
		/*
		 * we playing lottery and win number is 17
		 * we need to continue asking number from 1 to 100
		 * until correct number is entered
		 */

		Scanner input;
		int num;
		int lotteryNumber=17;
		input=new Scanner(System.in);
		
		do {
		System.out.println("Please enter any number from 1 to 100 to win the lottery");
		num=input.nextInt();
		} while(num!=lotteryNumber);
		
		
		System.out.println("You won!");
		}

}
