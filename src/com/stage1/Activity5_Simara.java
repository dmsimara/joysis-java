
package com.stage1;

import java.util.Scanner;

public class Activity5_Simara {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int choice;
        
        do {
            // initializations
            int sum = 0;
            long product = 1;

            System.out.print("Enter a number: ");
            int startNumber = input.nextInt();

            System.out.println("");
            int tempStartNumber = startNumber;

            System.out.print("Sum: ");
            for (int i = 1; i < 11; i++) {

                int commonDifference = 5;

                System.out.print(tempStartNumber);

                sum += tempStartNumber;

                if (i < 10) {
                    System.out.print(" + ");
                } else {
                    System.out.println(" = " + sum);
                }

                tempStartNumber += commonDifference;
            }

            // this is for the product
            System.out.print("Product: ");
            tempStartNumber = startNumber;

            for (int i = 1; i < 11; i++) {
                int commonDifference = 5;

                System.out.print(tempStartNumber);

                product *= tempStartNumber;

                if (i < 10) {
                    System.out.print(" * ");
                } else {
                    System.out.println(" = " + product);
                }

                tempStartNumber += commonDifference;
            }

            System.out.println("\nDo you want to try again?");
            System.out.println("    [1] Yes");
            System.out.println("    [2] No");
            System.out.print("Enter your answer: ");
            choice = input.nextInt();
            
            System.out.println("");
            
        } while (choice == 1);
       
    }
}