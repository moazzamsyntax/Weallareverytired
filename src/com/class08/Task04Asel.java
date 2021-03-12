package com.class08;

import java.util.Scanner;

public class Task04Asel {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        String item;
        int price;
        int money;
        int remainder;
        int sum=0;
        
        System.out.println("Please enter an item you would like to buy");
        item=input.nextLine();
        
        System.out.println("Please enter the price of "+item);
        price=input.nextInt();
        System.out.println("Please pay for "+item);
        
        do {
            money=input.nextInt();
            sum+=money;
            
            if (sum<price) {
                
                remainder=price-sum;
                
                System.out.println("Please give "+remainder);
                
            }else if (sum>price){
                
                remainder=sum-price;
                
                System.out.println("Here is your change "+remainder);
                
                break;
                
            }else {
                System.out.println("You got the right amount");
            }
            
        }while(price!=sum);
        
        System.out.println("Thank you for shopping");

	}

}
