package com.codegnan.controlstatements;

import java.util.Scanner;

public class employee_salary_calculation {

	public static void main(String[] args) {
		/*An employee’s salary is calculated based on their performance,
		 *  years of experience,
		 and whether they are eligible for a bonus. 
		 The rules for the calculation are:
		Base Salary:
		Junior (Less than 2 years): ₹30,000
		Mid-level (2 to 5 years): ₹50,000
		Senior (More than 5 years): ₹70,000


		Bonus:
		Employees with a performance score of 8 or 
		above get a 10% bonus on their salary.*/
		Scanner scanner = new Scanner(System.in);

      
        System.out.println("Enter years of experience:");
        int experience = scanner.nextInt();

        System.out.println("Enter performance score (0 to 10):");
        int performance = scanner.nextInt();

        int baseSalary = 0;

       
        if (experience < 2) {
            baseSalary = 30000;
        } else if (experience <= 5) {
            baseSalary = 50000;
        } else {
            baseSalary = 70000;
        }

        double bonus = 0;

        
        if (performance >= 8) {
            bonus = baseSalary * 0.10;
        }

        double Totalsalary= baseSalary + bonus;

        
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + Totalsalary);

        scanner.close();
	}

}
