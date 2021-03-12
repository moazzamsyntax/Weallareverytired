package com.class06;

import java.util.Scanner;

public class CheckingRepl {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
	    boolean thirsty=true;
	boolean sleepy=true;
	    System.out.println("Are you thirsty?");
	    thirsty=input.nextBoolean();
	    System.out.println("Are you sleepy?");
	    sleepy=input.nextBoolean();
	    String drink = null;

	    if(thirsty){
	      if(!sleepy){
	        drink="water";
	      }
	    }else if(thirsty){
	        if(sleepy){
	            drink="tea";
	          }
	    }else if (!thirsty){
	      if(!sleepy){
	        drink="tea";
	      }
	    }else{
	      drink="nothing";
	    }

	    

	    System.out.println("Looks like you need to drink "+drink);

			}
}
	

