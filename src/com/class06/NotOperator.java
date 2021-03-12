package com.class06;

public class NotOperator {

	public static void main(String[] args) {


		boolean rain=false;
		if(!rain) { // 
			System.out.println("I'll go to the park");
		}
		
		boolean boo=!true; //it says boolean is false
		System.out.println(boo); //print false
		
 
		boolean boo1=!false; // it says boolean is true
		System.out.println(boo1); // print true
		
		boolean traffic=false;
		
		if(!traffic) {
			System.out.println("I will come on time");
		}
		
		String day="Sunday";
		
		if(!day.equals("Friday")) {
			System.out.println("Today is not Friday");
		}
		
		boolean homework=true;
		if(!homework) {
			System.out.println("I'll be happy");
		}
	}

}
