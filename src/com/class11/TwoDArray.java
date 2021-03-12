package com.class11;

public class TwoDArray {

	public static void main(String[] args) {
		
		int[][]num=new int [3][4];
		

		num[0][0]=1;
		num[0][1]=2;
		num[0][2]=3;
		num[0][3]=4;
		
		num[1][0]=10;
		num[1][1]=20;
		num[1][2]=30;
		num[1][3]=40;
		
		num[2][0]=100;
		num[2][1]=200;
		num[2][2]=300;
		num[2][3]=400;
		
		int [][]num1={
			{1,2,3,4},
			{10,20,30},
			{100,200,300,400}
			};
		
		for (int i=0; i<num1.length; i++) {
			for (int j=0; j<num1[i].length; j++) {
				System.out.print(num1[i][j]+" ");
			}
			System.out.println();
		}
	}

}
