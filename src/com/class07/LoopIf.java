package com.class07;

public class LoopIf {

	public static void main(String[] args) {

		int e = 20;

		while (e <= 100) {
			System.out.print(e + " ");
			e += 2;

		}

		System.out.println("New var");

		int y = 20;

		while (y <= 100) {
			if (y % 2 == 0) {
				System.out.print(y + " ");
			}
			y++;
		}
	
	}

}
