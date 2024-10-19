
package com.stage2;

import java.util.Scanner;

public class Activity10_Simara {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        byte choice;

        do {
            System.out.println("\nWelcome to Load Registration!");
            System.out.println("[1] Text Only Promos");
            System.out.println("[2] Call Only Promos");
            System.out.println("[3] GoSURF Promos");
            System.out.println("[4] Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextByte();

            switch (choice) {
                case 1:
                    showTextOnlyPromos();
                    exitProgram();
                    break;
                case 2:
                    showCallOnlyPromos();
                    exitProgram();
                case 3:
                    showGoSurfPromos();
                    exitProgram();
                    break;
                case 4:
                    exitProgram();
                    exitProgram();
                    break;
                default:
                    System.out.println("\nInvalid input. \nPlease try again.\n");
            }
        } while (choice != 3); 
    }
    
    public static void showTextOnlyPromos() {
        System.out.println("\nWelcome to Text Only Promos!");
        System.out.println("[1] 1 Day, P20");
        System.out.println("[2] 2 Days, P30");
        System.out.println("[3] 5 Days, P50");
        System.out.println("[4] 7 Days, P90");
        System.out.print("Enter your choice: ");
        byte choice = sc.nextByte();

        switch (choice) {
            case 1:
                subscribeToPromo("1 Day");
                break;
            case 2:
                subscribeToPromo("2 Days");
                break;
            case 3:
                subscribeToPromo("5 Days");
                break;
            case 4:
                subscribeToPromo("7 Days");
                break;
            default:
                System.out.println("\nInvalid input. \nPlease try again.\n");
        }
    }
    
    public static void showCallOnlyPromos() {
        System.out.println("\nWelcome to Call Only Promos!");
        System.out.println("[1] 1 Day, P35");
        System.out.println("[2] 2 Days, P45");
        System.out.println("[3] 5 Days, P65");
        System.out.println("[4] 7 Days, P105");
        System.out.print("Enter your choice: ");
        byte choice = sc.nextByte();

        switch (choice) {
            case 1:
                subscribeToPromo("1 Day");
                break;
            case 2:
                subscribeToPromo("2 Days");
                break;
            case 3:
                subscribeToPromo("5 Days");
                break;
            case 4:
                subscribeToPromo("7 Days");
                break;
            default:
                System.out.println("\nInvalid input. \nPlease try again.\n");
        }
    }

    public static void showGoSurfPromos() {
        System.out.println("\nWelcome to GoSURF Promos!");
        System.out.println("[1] GoSURF30, P30");
        System.out.println("[2] GoSURF299, P299");
        System.out.println("[3] GoSURF599, P599");
        System.out.println("[4] GoSURF999, P999");

        System.out.print("Enter your choice: ");
        byte choice = sc.nextByte();

        switch (choice) {
            case 1:
                subscribeToPromo("GoSURF30");
                break;
            case 2:
                subscribeToPromo("GoSURF299");
                break;
            case 3:
                subscribeToPromo("GoSURF599");
                break;
            case 4:
                subscribeToPromo("GoSURF999");
                break;
            default:
                System.out.println("\nInvalid input. \nPlease try again.\n");
        }
    }

    public static void subscribeToPromo(String promoName) {
        System.out.printf("\nDo you want to subscribe to %s?\n", promoName);
        System.out.println("[1] Subscribe");
        System.out.println("[2] Back");
        System.out.println("[3] Exit");

        System.out.print("Enter your choice: ");
        byte choice = sc.nextByte();

        switch (choice) {
            case 1:
                System.out.printf("\nCongratulations! You are now subscribed to %s!\n", promoName);
                break;
            case 2:
                break;
            case 3:
                confirmExit();
                break;
            default:
                System.out.println("\nInvalid input. \nPlease try again.\n");
        }
    }

    public static void confirmExit() {
        System.out.println("\nAre you sure you want to exit the Load Registration?");
        System.out.println("[1] Yes");
        System.out.println("[2] No");

        System.out.print("Enter your choice: ");
        byte choice = sc.nextByte();

        if (choice == 1) {
            System.out.println("\nExiting the Load Registration...| Thank you for coming!");
            System.exit(0); // Exit the program
        } else if (choice == 2) {
            // Just return to the previous menu
        } else {
            System.out.println("\nInvalid input. \nPlease try again.\n");
        }
    }

    public static void exitProgram() {
        System.out.println("\nAre you sure you want to exit the Load Registration?");
        System.out.println("[1] Yes");
        System.out.println("[2] No");

        System.out.print("Enter your choice: ");
        byte choice = sc.nextByte();

        if (choice == 1) {
            System.out.println("\nExiting the Load Registration...| Thank you for coming!\n");
            System.exit(0); // Exit the program
        } else if (choice == 2) {
            // Just return to the main menu
        } else {
            System.out.println("\nInvalid input. \nPlease try again.\n");
        }
    }
}
