package com.class07;

import java.util.Scanner;

public class ScannerLoops {

	public static void main(String[] args) {


		Scanner input;
		String name;
		
		input=new Scanner(System.in);
		
		int num=1;
		while(num<=5) {
		System.out.println("Please enter your name");
		name=input.nextLine();
		System.out.println("Hello "+name);
		num++;
	}

}
}
