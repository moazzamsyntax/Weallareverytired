package com.class09;

public class NestedLoopHours {

	public static void main(String[] args) {

		for (int i = 0; i <= 24; i++) {

			for (int j = 0; j <= 59; j++) {
				if (i <= 10 && j < 10) {
					System.out.println("0" + i + ":0" + j);
				} else if (i < 10 && j >= 10) {
					System.out.println("0" + i + ":" + j);
				} else if (i >= 10 && j < 10) {
					System.out.println(i + ":0" + j);
				} else {

					System.out.println(i + ":" + j);
				}
			}
		}

		System.out.println("---------------------------");

		for (int h = 0; h <= 24; h++) {

			for (int m = 0; m <= 59; m++) {
				if (h < 10) {
					if (m < 10) {
						System.out.println("0" + h + ":0" + m);
					} else {
						System.out.println("0" + h + ":" + m);
					}

				} else {
					if (m < 10) {
						System.out.println(h + ":0" + m);
					} else {
						System.out.println(h + ":" + m);
					}
				}
			}
		}

	}

}
