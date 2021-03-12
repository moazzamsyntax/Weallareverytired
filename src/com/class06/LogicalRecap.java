package com.class06;

import java.util.Scanner;

public class LogicalRecap {

	public static void main(String[] args) {
		/* we need to get time
		 * based on the time we need to identify what is the time of the day 
		 * time btw 1-11 --> morning
		 * time btw 12-13 --> noon
		 * time btw 14-17 --> afternoon
		 * time btw 18-21 --> evening
		 * time btw 22-24 --> night
		 */

		Scanner scan;
		int time;
		String timeOfTheDay = null; //compiler initialized variables to their default values: int -0, double - 0.0, boolean - true
		//string - null - for all non-primitives
		//instead of null we can use word that we would use in else part - "Invalid"
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your time in 24H format");
		
		time=scan.nextInt();
		
		if(time>=1 && time<=11) {
			timeOfTheDay="Morning";
		}else if (time>=12 && time<=13){
			timeOfTheDay="Noon";
		}else if (time>=14 && time<=17){
			timeOfTheDay="Afternoon";
		}else if (time>=18 && time<=21){
			timeOfTheDay="Evening";
		}else if (time>=22 && time<=24){
			timeOfTheDay="Night";
		}
		
		System.out.println(timeOfTheDay);
	}

}
