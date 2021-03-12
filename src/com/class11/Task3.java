package com.class11;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array that first row will contain 4 names and second row will contain grades. 
		 * Then your program should print name of the students that has A and B grade
		 */
		
		String [][]student= {{"Yuliya", "Alex", "Mike", "Tony"}, {"A","B","C","D"}};
		
		System.out.println(student[0][0]+" has grade "+student[1][0]+" and "+student[0][1]+" has grade "+student[1][1]);

	}

}
