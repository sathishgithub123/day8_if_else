package com.codegnan.controlstatements;

import java.util.Scanner;

public class tax_percentage {

	public static void main(String[] args) {
		/*Write a Java program to calculate the tax percentage based
		 *  on income using nested if–else statements.
 		The program should read an integer income and determine the tax 
 		percentage as per the rules below:
		Income Range (₹)       Tax Percentage
		≤ 10,000                0%
		10,001 – 50,000         10%
		50,001 – 100,000        20%
		> 100,000               30%
		 							*/
		Scanner scanner=new Scanner(System.in);
        
        System.out.print("Enter your income: ");
        int income = scanner.nextInt();
        
        int taxPercentage;
        
        if (income <= 10000) {
            taxPercentage = 0;
        } else {
            if (income <= 50000) {
                taxPercentage = 10;
            } else {
                if (income <= 100000) {
                    taxPercentage = 20;
                } else {
                    taxPercentage = 30;
                }
            }
        }

       
        System.out.println(taxPercentage + "%");

        scanner.close();
    }

	}


