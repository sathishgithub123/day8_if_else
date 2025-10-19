package com.codegnan.controlstatements;

import java.util.Scanner;

public class body_mass_index {

	public static void main(String[] args) {
		/*Take weight (in kilograms) and height (in meters) as input.
		Compute BMI = weight / (height × height).


		Display the category based on the following table:
		BMI Range           Category
		< 18.5            Under weight
		18.5 – 24.9        Normal
		25.0 – 29.9       Overweight
		≥ 30.0             Obese */
		
		Scanner scanner=new Scanner(System.in);
        
      
        System.out.println("Enter your weight (in kg):");
        double weight = scanner.nextDouble();

       
        System.out.println("Enter your height (in meters):");
        double height = scanner.nextDouble();

       
        double bmi = weight / (height * height);
        
        String category;

        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi < 25.0) {
            category = "Normal";
        } else if (bmi < 30.0) {
            category = "Overweight";
        } else {
            category = "Obese";
        }

        
        System.out.println("Your BMI is: " + bmi);
        System.out.println("Category: " + category);

        scanner.close();

	}

}
