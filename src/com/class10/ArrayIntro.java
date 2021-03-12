package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {


		int num=10;
		num=20;
		System.out.println(num);
		
		int [] array=new int[5];
		
		array[0]=10;
		array[1]=12;
		array[2]=15;
		array[3]=9;
		array[4]=13;
		
		System.out.println(array[2]);
		
		double [] numbers=new double[2];
		
		numbers[0]=10.99;
		numbers[1]=19.01;
		
		numbers[0]=11.99;
		
		System.out.println(numbers[0]);
		
		String [] names=new String[3];
		
		names[0]="Jahanzeb";
		names[1]="Ozoda";
		//names[2]="Alec";
		
		//names[3]="Yuliya"; //we cant add elements outside a number
		
		System.out.println(names[2]);
		
		//arrays are fixed in size
		
		int size=names.length; //how to check length of array
		
		System.out.println(size);

	}

}
