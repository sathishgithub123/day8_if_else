package com.codegnan.controlstatements;

import java.util.Scanner;

public class square_rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter four side lengths (a b c d):");
		 Scanner scanner=new Scanner(System.in);
	        
	        int a = scanner.nextInt();
	        int b = scanner.nextInt();
	        int c = scanner.nextInt();
	        int d = scanner.nextInt();

	     
	        if (a == b && b == c && c == d) {
	            System.out.println("Square");
	        } else if (a == c && b == d) {
	            System.out.println("Rectangle");
	        } else {
	            System.out.println("Other");
	        }

	        scanner.close();
	}

}
