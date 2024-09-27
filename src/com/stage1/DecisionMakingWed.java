
package com.stage1;

import java.util.Scanner;

public class DecisionMakingWed {
    public static void main(String[] args) {
        /*
        // simple if statement
        
        byte num = 100;
        
        if (num > 0) {
            System.out.println("Positive Number");
        }
        
        // if-else statement
        
        byte num1 = 100;
        
        if (num1 % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        
        // if-else-if statement
        
        // example 1
        byte num2 = -60;
        String result;
        
        if (num2 > 0) {
            result = "Positive Number";
        } else if (num2 < 0) {
            result = "Negative Number";
        } else {
            result = "Neutral Number";
        }
        
        System.out.println(result); */
        
        /*
        // example 2
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a day: ");
        byte day = sc.nextByte();
        
        String result1;
                
        if (day == 1) {
            result1 = "<Monday";
        } else if (day == 2) {
            result1 = "Tuesday";
        } else if (day == 3) {
            result1 = "Wednesday";
        } else if (day == 4) {
            result1 = "Thursday";
        } else if (day == 5) {
            result1 = "Friday";
        } else if (day == 6) {
            result1 = "Saturday";
        } else if (day == 7) {
            result1 = "Sunday";
        } else {
            System.out.println("Invalid Input");
            return;
        }
        
        System.out.println("Today is " + result1);
        */
        
        // example 3
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a day from Monday to Sunday: ");
        String day = sc.nextLine();
        
        String result3;
        
        if (day.equals("Monday")) {
            result3 = "First Day of the Week";
        } else if (day.equals("Tuesday")) {
            result3 = "Second Day of the Week";
        } else if (day.equals("Wednesday")) {
            result3 = "Third Day of the Week";
        } else if (day.equals("Thursday")) {
            result3 = "Fourth Day of the Week";
        } else if (day.equals("Friday")) {
            result3 = "Fifth Day of the Week";
        } else if (day.equals("Saturday")) {
            result3 = "Sixth Day of the Week";
        } else if (day.equals("Sunday")) {
            result3 = "Last Day of the Week";
        } else {
            System.out.println("Invalid Input.");
            return;
        }
        
        System.out.println(result3);
    }
}

