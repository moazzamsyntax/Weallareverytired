package com.class11;

public class AllValuesFromArray {

	public static void main(String[] args) {


		String[][]usa= {
				
				{"Alexandria", "Oakton", "Arlington", "Virginia Beach", "Fairfax"},
				{"Philly", "Strassburg", "Pittsburgh"},
				{"Boston", "Quincy", "Springfield", "Burlington"},
				{"Los Angeles", "Long Beach","San Francisco", "Sacramento", "Santa Barbara" },
				{"Miami", "Orlando", "Tampa", "Tallahasee"}
		};
		

		
		for (int i=0; i<usa.length; i++) {
			for (int j=0; j<usa[i].length; j++) {
				System.out.print(usa[i][j]+" ");
			}
			System.out.println();
		}
			System.out.println("---------------------");
			
			for (String []country:usa) {
				for (String c:country) {
					System.out.print(c+" ");
				}
				System.out.println();
			}
		}

	}


