
package com.stage1;

import java.util.Scanner;

public class Activity3_Simara {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // to input age in the console
        
        System.out.print("Enter your age: "); // prompt message
        
        // initializion of the variables
        byte age = sc.nextByte(); // to store the age input
        String categorization; // to store the result
        
        // if-else-if statements to categorize the age
        /*if (age > 100 || age < 0) {
            System.out.println("Invalid Input.");
            return;
        } else if (age >= 60) {
            categorization = "Senior";
        } else if (age >= 30) {
            categorization = "Adult";
        } else if (age >= 20) {
            categorization = "Young Adult";
        } else if (age >= 13) {
            categorization = "Teenager";
        } else if (age >= 3) {
            categorization = "Child";
        } else {
            categorization = "Baby";
        } */
        
        
        // nested if statements - thursday
        
        if (age > 100 || age < 0) {
            System.out.println("Invalid Input.");
            return;
        } else if (age >= 60) {
            categorization = "Senior";
            if (age <= 70) {
                System.out.println("You are not eligible to pension.");
            } else if (age <= 100) {
                System.out.println("You are eligibile to pension.");
            }
        } else if (age >= 30) {
            categorization = "Adult";
        } else if (age >= 20) {
            categorization = "Young Adult";
        } else if (age >= 13) {
            categorization = "Teenager";
        } else if (age >= 3) {
            categorization = "Child";
            if (age <= 4) {
                System.out.println("Preschooler");
            } else {
                System.out.println("School-aged Child");
            }
        } else {
            categorization = "Baby";
        }
        
        System.out.println("Category: " + categorization); // printing the result
        
    }
}

