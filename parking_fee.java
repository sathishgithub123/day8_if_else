package com.codegnan.controlstatements;

import java.util.Scanner;

public class parking_fee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		       
		System.out.println("Enter the vehicle type (Car, Bike, Truck):");
		String type = scanner.next().toLowerCase();

		System.out.println("Enter the time of arrival (0-23):");
		int arrival = scanner.nextInt();

		System.out.println("Enter the time of departure (0-23):");
		int departure = scanner.nextInt();

		int hours = 0;

		        
		if (departure >= arrival) {
			
		    hours = departure - arrival;
		    } else {	    	
		        hours = (24 - arrival) + departure;	        
		        }

		        
		int rate = 0;
		
		if (type.equals("car")) {			
		    rate = 50;
		    } else if (type.equals("bike")) {		    	
		        rate = 30;	        
		        } else if (type.equals("truck")) {
		            rate = 100;
		        } else {
		            System.out.println("Invalid vehicle type!");
		            scanner.close();
		            return;
		 }

		 double total = 0;
		 
		 int currentHour = arrival;

		        
		 for (int i = 0; i < hours; i++) {
			 
		     int hour = (currentHour + i) % 24;

		     boolean isSurchargeHour = (hour >= 18 || hour < 8);
		     double hourlyRate = rate;

		     if (isSurchargeHour) {
		         hourlyRate *= 1.5; 
		         }

		         total += hourlyRate;
		        }

		        
		     if (hours > 5) {
		        total *= 0.8;
		     }

		        
		     System.out.println("Total parking hours: " + hours);
		     System.out.println("Base rate per hour for " + type + ": " + rate);
		     System.out.println("Total parking fee: " + total);

		     scanner.close();
		    }
		

	}

