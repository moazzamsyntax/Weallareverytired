package com.class07;

public class HomeWork {

	public static void main(String[] args) {
		
		// calculate sum of even and odd numbers from 1 to 50
		
		int sum=0;
		int sum2=0;
		
		
		for(int i=0; i<=50; i+=2) {
			sum+=i;
		}
		
		for(int k=1; k<=50; k+=2) {
			sum2+=k;
		}
		
		int result=sum+sum2;
		
		System.out.println(result);

	}

}
