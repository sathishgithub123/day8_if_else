package com.codegnan.controlstatements;

import java.util.Scanner;

public class traffic_signals_2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter light color (Green, Yellow, or Red): ");
        String light = scanner.nextLine().trim().toLowerCase();

        
        System.out.print("Enter hour (0–23): ");
        int hour = scanner.nextInt();

        String action;

        if (light.equals("green")) {
            action = "Go";
            
        } else if (light.equals("red")) {
            action = "Stop";
            
        } else if (light.equals("yellow")) {
        	
            if (hour >= 6 && hour < 18) {
                action = "Slow"; 
                
            } else {           	
            	action = "Stop";  
            }
        } else {
            action = "Invalid light color!";
        }

        System.out.println("Action: " + action);

        scanner.close();
        }

	}

