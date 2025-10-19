package com.codegnan.controlstatements;

import java.util.Scanner;

public class cart_price_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Create a Java program to compute the total bill for a shopping cart.
		 *  Conditions:

			If total amount:
			is ≥ ₹10,000, apply 20% discount
			is ≥ ₹5000, apply 10% discount
			else, no discount
			If it’s a festival season, apply an extra 5% discount.
			If the user has a premium membership, 
			apply an additional ₹200 flat discount.
			Show total price, all applied discounts, 
			and final payable amount.*/
		
				Scanner scanner=new Scanner(System.in);
				
		        System.out.println("Enter total cart amount: ₹");
		        double total = scanner.nextDouble();

		        System.out.println("Is it festival season? (yes/no): ");
		        boolean isFestival = scanner.next().equalsIgnoreCase("yes");

		        System.out.println("Do you have premium membership? (yes/no): ");
		        boolean isPremium = scanner.next().equalsIgnoreCase("yes");

		        double originalTotal = total;
		        double discount = 0;
		        double festivalDiscount = 0;
		        double premiumDiscount = 0;

		        total = total - discount;
		        
		        if (total >= 10000) {
		            discount = total * 0.20;
		        } else if (total >= 5000) {
		            discount = total * 0.10;
		        }

		        

		        if (isFestival) {
		            festivalDiscount = total * 0.05;
		            total = total - festivalDiscount;
		        }

		   
		        if (isPremium) {
		            premiumDiscount = 200;
		            total = total - premiumDiscount;
		        }

		      
		        System.out.println("----- BILL SUMMARY -----");
		        System.out.println("Original Total: ₹" + originalTotal);
		        System.out.println("Amount Discount: ₹" + discount);
		        System.out.println("Festival Discount: ₹" + festivalDiscount);
		        System.out.println("Premium Discount: ₹" + premiumDiscount);
		        System.out.println("Final Payable Amount: ₹" + total);

		        scanner.close();
		    }


	}

