
package com.stage1;

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String accountName = "Winter";
        
        System.out.println("Do you want yo delete " + accountName + "\n" + "\n [Y] Yes" + "\n [N] No");
        System.out.println("Enter a choice: ");
        String input = sc.nextLine();
        
        if (input.equalsIgnoreCase("Y")) {
            System.out.println("Your account " + accountName + " is deleted sucessful.");
        } else {
            System.out.println("Your account " + accountName + " is not deleted.");
        } 
    }
}
