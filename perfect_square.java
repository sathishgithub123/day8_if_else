package com.codegnan.controlstatements;

import java.util.Scanner;

public class perfect_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a Java program to check whether a given number is a
		 *  Perfect Square using nested if–else statements.
 			A number n is said to be a Perfect Square if there exists 
 			an integer x such that x × x = n.
		 */
		
		Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter a number:");
        int n = scanner.nextInt();

       
        String result;

       
        if (n >= 0) {
            
            int sqrt = (int)(Math.sqrt(n));  

          
            if (sqrt * sqrt == n) {
                result = "Perfect Square";
            } else {
                result = "Not Perfect Square";
            }
        } else {
            
            result = "Not Perfect Square";
        }
        System.out.println(result);

        scanner.close();
	}

}
