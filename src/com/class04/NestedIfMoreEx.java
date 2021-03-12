package com.class04;

public class NestedIfMoreEx {

	public static void main(String[] args) {

/*
 * if it is friday --> go to the movie
 * otherwise ---> stay at home
 * if it is friday then I will check if day is 13 - scary movie otherwise - any movie I like
 */

		
		boolean isFriday=false;
		int date=15;
		
		if(isFriday) {
			System.out.println("I go to movie, but let me check what movie I will watch");
			if(date==13) {
				System.out.println("I will watch a scary movie");
			}else {
				System.out.println("I will watch any movie I like");
			}
		}else {
			System.out.println("I will stay at home and study Java");
		}
		
		
		System.out.println("-------------Example 2-------------");
		
		boolean completed=true;
		int score=76;
		
		if(completed) {
			if(score>90) {
			System.out.println("Great job");
			}else if (score>80) {
				System.out.println("Good job");
			}
			else if(score>70) {
				System.out.println("Good, but let's try to do better");
			}else {
				System.out.println("Good for truying, but study more");
			}
		}else {
			System.out.println("Please make sure to complete all assignments on time");
		}
	}

}
