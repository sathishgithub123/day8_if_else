package com.codegnan.controlstatements;

import java.util.Scanner;

public class electricity_bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a Java program to calculate the monthly electricity bill based 
		 * on the number of units consumed, applying the following slab rates:
			Units Consumed
			Rate per Unit
			0 - 100
			₹1.50
			101 - 200
			₹2.00
			201 - 300
			₹3.00
			Above 300
			₹5.00

			If the total bill exceeds ₹1000, apply a 10% surcharge.
			If the user is a senior citizen, 
			apply an additional 5% discount on the total.*/
		
			Scanner scanner=new Scanner(System.in);
		
			System.out.println("enter the units consumed: ");
			int units = scanner.nextInt();
			
			
			System.out.println("are you senior citizen(yes/no): ");
			boolean isSenior = scanner.next().equalsIgnoreCase("yes");

			
			double bill = 0;

	        if (units <= 100) {
	            bill = units * 1.5;
	        } else if (units <= 200) {
	            bill = 100 * 1.5 + (units - 100) * 2.0;
	        } else if (units <= 300) {
	            bill = 100 * 1.5 + 100 * 2.0 + (units - 200) * 3.0;
	        } else {
	            bill = 100 * 1.5 + 100 * 2.0 + 100 * 3.0 + (units - 300) * 5.0;
	        }

	        if (bill > 1000) {
	            bill += bill * 0.10;
	        }

	        if (isSenior) {
	            bill -= bill * 0.05; 
	        }

	        System.out.println("Total electricity bill: " + bill);

	}
}