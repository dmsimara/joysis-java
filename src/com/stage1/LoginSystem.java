
package com.stage1;

import java.util.Scanner;


public class LoginSystem {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String registeredUsername = "winter12";
        String registeredPassword = "12345";
        boolean isLoginCorrect = true;
        
        while (isLoginCorrect) {
            System.out.print("Enter your password: ");
            String inputtedPassword = input.nextLine();
            
            if (registeredPassword.equals(inputtedPassword)) {
                System.out.println("\nLogged in successfully!\n");
                isLoginCorrect = false;
            } else {
                System.out.println("Invalid Password\n");
            }
        }
    }
}
