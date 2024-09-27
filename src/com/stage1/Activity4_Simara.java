
package com.stage1;

import java.util.Scanner;


public class Activity4_Simara {
    public static void main(String[] args) {
        
        System.out.println("***************************************");
        System.out.println("*                                     *");
        System.out.println("*          Load Registration          *");
        System.out.println("*                                     *");
        System.out.println("***************************************");
        System.out.println("\n    [1] Text Only");
        System.out.println("    [2] Call Only");
        System.out.println("    [3] Go Surf");
        System.out.println("    [4] Exit");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: "); // choice for load registration
        byte choice = sc.nextByte();
        
        switch(choice) {
            case 1:
                System.out.println("\nWelcome to Text Only Promos!");
                System.out.println(" \n    [1] 1 Day, P20");
                System.out.println("    [2] 2 Days, P30");
                System.out.println("    [3] 5 Days, P50");
                System.out.println("    [4] 7 Days, P90");
                
                System.out.print("Enter your choice: "); // choice for text only promos
                choice = sc.nextByte();
                
                // if-else-if statement for text only promos
                if (choice == 1) {
                    System.out.println("\nDo you want to subscribe to Unli Text for 1 Day?");
                    System.out.println("     [1] Subscribe");
                    System.out.println("     [2] Back");
                    System.out.println("     [3] Exit");
                    
                    System.out.print("Enter your choice: "); // choice if they want to subscribe
                    choice = sc.nextByte();
                    
                    // switch for subscription 1
                    switch (choice) {
                        case 1:
                            System.out.println("\nCongratulations! You are now subscribed to Unli Text for 1 Day!\n");
                        case 2:
                            break;
                        case 3:
                            System.out.println("\nAre you sure you want to exit the Load Registration?");
                            System.out.println("     [1] Yes");
                            System.out.println("     [2] No");

                            System.out.print("Enter your choice: ");
                            choice = sc.nextByte();

                            if (choice == 1) {
                                System.out.println("\nExiting the Load Registration...| Thank you for coming!\n");
                                break;
                            } else if (choice == 2) {
                                break;
                            } else {
                                System.out.println("\nInvalid input...| Please try again.\n");
                                break;
                            }
                        default:
                            System.out.println("\nInvalid input...| Please try again.\n");
                    }
                } else if (choice == 2) { // 2nd option - 2 days
                    System.out.println("\nDo you want to subscribe to Unli Text for 2 Days?");
                    System.out.println("     [1] Subscribe");
                    System.out.println("     [2] Back");
                    System.out.println("     [3] Exit");
                    
                    System.out.print("Enter your choice: "); // choice if they want to subscribe
                    choice = sc.nextByte();
                    
                    // switch for subscription 2
                    switch (choice) {
                        case 1:
                            System.out.println("\nCongratulations! You are now subscribed to Unli Text for 2 Days!\n");
                        case 2:
                            break;
                        case 3: 
                            System.out.println("\nAre you sure you want to exit the Load Registration?");
                            System.out.println("     [1] Yes");
                            System.out.println("     [2] No");
                            
                            System.out.print("Enter your choice: ");
                            choice = sc.nextByte();
                            
                            if (choice == 1) {
                                System.out.println("\nExiting the Load Registration...| Thank you for coming!\n");
                                break;
                            } else if (choice == 2) {
                                break;
                            } else {
                                System.out.println("\nInvalid input...| Please try again.\n");
                                break;
                            }
                        default: 
                            System.out.println("\nInvalid input...| Please try again.\n");
                    }
                } else if (choice == 3) { // 3rd option - 5 days
                    System.out.println("\nDo you want to subscribe to Unli Text for 5 Days?");
                    System.out.println("     [1] Subscribe");
                    System.out.println("     [2] Back");
                    System.out.println("     [3] Exit");
                    
                    System.out.print("Enter your choice: "); // choice if they want to subscribe
                    choice = sc.nextByte();
                    
                    // switch for subscription 3
                    switch (choice) {
                        case 1:
                            System.out.println("\nCongratulations! You are now subscribed to Unli Text for 5 Days!\n");
                        case 2:
                            break;
                        case 3: 
                            System.out.println("\nAre you sure you want to exit the Load Registration?");
                            System.out.println("     [1] Yes");
                            System.out.println("     [2] No");
                            
                            System.out.print("Enter your choice: ");
                            choice = sc.nextByte();
                            
                            if (choice == 1) {
                                System.out.println("\nExiting the Load Registration...| Thank you for coming!\n");
                                break;
                            } else if (choice == 2) {
                                break;
                            } else {
                                System.out.println("\nInvalid input...| Please try again.\n");
                                break;
                            }
                        default: 
                            System.out.println("\nInvalid input...| Please try again.\n");
                    }
                } else if (choice == 4) { // 4th option - 7 days
                    System.out.println("\nDo you want to subscribe to Unli Text for 7 Days?");
                    System.out.println("     [1] Subscribe");
                    System.out.println("     [2] Back");
                    System.out.println("     [3] Exit");
                    
                    System.out.print("Enter your choice: "); // choice if they want to subscribe
                    choice = sc.nextByte();
                    
                    // switch for subscription 4
                    switch (choice) {
                        case 1:
                            System.out.println("\nCongratulations! You are now subscribed to Unli Text for 7 Days!\n");
                        case 2:
                            break;
                        case 3: 
                            System.out.println("\nAre you sure you want to exit the Load Registration?");
                            System.out.println("     [1] Yes");
                            System.out.println("     [2] No");
                            
                            System.out.print("Enter your choice: ");
                            choice = sc.nextByte();
                            
                            if (choice == 1) {
                                System.out.println("\nExiting the Load Registration...| Thank you for coming!\n");
                                break;
                            } else if (choice == 2) {
                                break;
                            } else {
                                System.out.println("\nInvalid input...| Please try again.\n");
                                break;
                            }
                        default: 
                            System.out.println("\nInvalid input...| Please try again.\n");
                    }
                } else {
                    System.out.println("\nInvalid input...| Please try again.\n");
                    break;
                }
                
                break;
             
                
            // FOR CALL ONLY PROMOS
            case 2:
                System.out.println("\nWelcome to Call Only Promos!");
                System.out.println(" \n    [1] 1 Day, P35");
                System.out.println("    [2] 2 Days, P45");
                System.out.println("    [3] 5 Days, P65");
                System.out.println("    [4] 7 Days, P105");
                
                System.out.print("Enter your choice: "); // choice for call only promos
                choice = sc.nextByte();
                
                if (choice == 1) { // 1st option - 1 Day
                    System.out.println("\nDo you want to subscribe to Unli Calls for 1 Day?");
                    System.out.println("     [1] Subscribe");
                    System.out.println("     [2] Back");
                    System.out.println("     [3] Exit");
                    
                    System.out.print("Enter your choice: "); // choice for subscription
                    choice = sc.nextByte();
                    
                    // switch for subscription 1
                    switch (choice) {
                        case 1:
                            System.out.println("\nCongratulations! You are now subscribed to Unli Calls for 1 day!");
                        case 2:
                            break;
                        case 3: 
                            System.out.println("\nAre you sure you want to exit the Load Registration?");
                            System.out.println("     [1] Yes");
                            System.out.println("     [2] No");
                            
                            System.out.print("Enter your choice: ");
                            choice = sc.nextByte();
                            
                            if (choice == 1) {
                                System.out.println("\nExiting the Load Registration...| Thank you for coming!\n");
                                break;
                            } else if (choice == 2) {
                                break;
                            } else {
                                System.out.println("\nInvalid input...| Please try again.\n");
                                break;
                            }
                        default: 
                            System.out.println("\nInvalid input...| Please try again.\n");
                    }
                } else if (choice == 2) { // 2nd option - 2 Days
                    System.out.println("\nDo you want to subscribe to Unli Calls for 2 Days?");
                    System.out.println("     [1] Subscribe");
                    System.out.println("     [2] Back");
                    System.out.println("     [3] Exit");

                    System.out.print("Enter your choice: "); // choice for subscription
                    choice = sc.nextByte();

                    // switch for subscription 2
                    switch (choice) {
                        case 1:
                            System.out.println("\nCongratulations! You are now subscribed to Unli Calls for 2 days!");
                        case 2:
                            break;
                        case 3:
                            System.out.println("\nAre you sure you want to exit the Load Registration?");
                            System.out.println("     [1] Yes");
                            System.out.println("     [2] No");

                            System.out.print("Enter your choice: ");
                            choice = sc.nextByte();

                            if (choice == 1) {
                                System.out.println("\nExiting the Load Registration...| Thank you for coming!\n");
                                break;
                            } else if (choice == 2) {
                                break;
                            } else {
                                System.out.println("\nInvalid input...| Please try again.\n");
                            }
                        default: 
                            System.out.println("\nInvalid input...| Please try again.\n");
                            break;
                    }
                } else if (choice == 3) { // 3rd Option - 5 Days
                    System.out.println("\nDo you want to subscribe to Unli Calls for 5 Days?");
                    System.out.println("     [1] Subscribe");
                    System.out.println("     [2] Back");
                    System.out.println("     [3] Exit");
                    
                    System.out.print("Enter your choice: "); // choice for subscription
                    choice = sc.nextByte();
                    
                    // switch for subscription 3
                    switch (choice) {
                        case 1:
                            System.out.println("\nCongratulations! You are now subscribed to Unli Calls for 5 days!");
                        case 2:
                            break;
                        case 3: 
                            System.out.println("\nAre you sure you want to exit the Load Registration?");
                            System.out.println("     [1] Yes");
                            System.out.println("     [2] No");
                            
                            System.out.print("Enter your choice: ");
                            choice = sc.nextByte();
                            
                            if (choice == 1) {
                                System.out.println("\nExiting the Load Registration...| Thank you for coming!\n");
                                break;
                            } else if (choice == 2) {
                                break;
                            } else {
                                System.out.println("\nInvalid input...| Please try again.\n");
                            }
                        default: 
                            System.out.println("\nInvalid input...| Please try again.\n");
                            break;
                    }
                } else if (choice == 4) { // 4th option - 7 Days
                    System.out.println("\nDo you want to subscribe to Unli Calls for 7 Days?");
                    System.out.println("     [1] Subscribe");
                    System.out.println("     [2] Back");
                    System.out.println("     [3] Exit");
                    
                    System.out.print("Enter your choice: "); // choice for subscription
                    choice = sc.nextByte();
                    
                    // switch for subscription 1
                    switch (choice) {
                        case 1:
                            System.out.println("\nCongratulations! You are now subscribed to Unli Calls for 7 days!");
                        case 2:
                            break;
                        case 3: 
                            System.out.println("\nAre you sure you want to exit the Load Registration?");
                            System.out.println("     [1] Yes");
                            System.out.println("     [2] No");
                            
                            System.out.print("Enter your choice: ");
                            choice = sc.nextByte();
                            
                            if (choice == 1) {
                                System.out.println("\nExiting the Load Registration...| Thank you for coming!\n");
                                break;
                            } else if (choice == 2) {
                                break;
                            } else {
                                System.out.println("\nInvalid input...| Please try again.\n");
                                break;
                            }
                        default:
                            System.out.println("\nInvalid input...| Please try again.\n");
                            break;
                    }
                } else {
                    System.out.println("\nInvalid input...| Please try again.\n");
                    break;
                }
                
                break;
                
                
            // FOR GoSURF PROMOS
            case 3:
                System.out.println("\nWelcome to GoSURF Promos!");
                System.out.println(" \n    [1] GoSURF30, P30");
                System.out.println("    [2] GoSURF299, P299");
                System.out.println("    [3] GoSURF599, P599");
                System.out.println("    [4] GoSURF999, P999");

                System.out.print("Enter your choice: ");
                choice = sc.nextByte();

                if (choice == 1) {
                    System.out.println("\nDo you want to subscribe to GoSURF30?");
                    System.out.println("     [1] Subscribe");
                    System.out.println("     [2] Back");
                    System.out.println("     [3] Exit");

                    System.out.print("Enter your choice: ");
                    choice = sc.nextByte();

                    switch (choice) {
                        case 1:
                            System.out.println("\nCongratulations! You are now subscribed to GoSURF30!\n");
                            break;
                        case 2:
                            break;
                        case 3:
                            System.out.println("\nAre you sure you want to exit the Load Registration?");
                            System.out.println("     [1] Yes");
                            System.out.println("     [2] No");

                            System.out.print("Enter your choice: ");
                            choice = sc.nextByte();

                            if (choice == 1) {
                                System.out.println("\nExiting the Load Registration...| Thank you for coming!");
                            } else if (choice == 2) {
                                break;
                            } else {
                                System.out.println("\nInvalid input. \nPlease try again.\n");
                            }
                            break;
                        default:
                            System.out.println("\nInvalid input. \nPlease try again.\n");
                            break;
                    }
                } else if (choice == 2) {
                    System.out.println("\nDo you want to subscribe to GoSURF299?");
                    System.out.println("     [1] Subscribe");
                    System.out.println("     [2] Back");
                    System.out.println("     [3] Exit");

                    System.out.print("Enter your choice: ");
                    choice = sc.nextByte();

                    switch (choice) {
                        case 1:
                            System.out.println("\nCongratulations! You are now subscribed to GoSURF299!\n");
                            break;
                        case 2:
                            break;
                        case 3:
                            System.out.println("\nAre you sure you want to exit the Load Registration?");
                            System.out.println("     [1] Yes");
                            System.out.println("     [2] No");

                            System.out.print("Enter your choice: ");
                            choice = sc.nextByte();

                            if (choice == 1) {
                                System.out.println("\nExiting the Load Registration...| Thank you for coming!");
                            } else if (choice == 2) {
                                break;
                            } else {
                                System.out.println("\nInvalid input. \nPlease try again.\n");
                            }
                            break;
                        default:
                            System.out.println("\nInvalid input. \nPlease try again.\n");
                            break;
                    }
                } else if (choice == 3) {
                    System.out.println("\nDo you want to subscribe to GoSURF599?");
                    System.out.println("     [1] Subscribe");
                    System.out.println("     [2] Back");
                    System.out.println("     [3] Exit");

                    System.out.print("Enter your choice: ");
                    choice = sc.nextByte();

                    switch (choice) {
                        case 1:
                            System.out.println("\nCongratulations! You are now subscribed to GoSURF599!\n");
                            break;
                        case 2:
                            break;
                        case 3:
                            System.out.println("\nAre you sure you want to exit the Load Registration?");
                            System.out.println("     [1] Yes");
                            System.out.println("     [2] No");

                            System.out.print("Enter your choice: ");
                            choice = sc.nextByte();

                            if (choice == 1) {
                                System.out.println("\nExiting the Load Registration...| Thank you for coming!");
                            } else if (choice == 2) {
                                break;
                            } else {
                                System.out.println("\nInvalid input. \nPlease try again.\n");
                            }
                            break;
                        default:
                            System.out.println("\nInvalid input. \nPlease try again.\n");
                            break;
                    }
                } else if (choice == 4) {
                    System.out.println("\nDo you want to subscribe to GoSURF999?");
                    System.out.println("     [1] Subscribe");
                    System.out.println("     [2] Back");
                    System.out.println("     [3] Exit");

                    System.out.print("Enter your choice: ");
                    choice = sc.nextByte();

                    switch (choice) {
                        case 1:
                            System.out.println("\nCongratulations! You are now subscribed to GoSURF999!\n");
                            break;
                        case 2:
                            break;
                        case 3:
                            System.out.println("\nAre you sure you want to exit the Load Registration?");
                            System.out.println("     [1] Yes");
                            System.out.println("     [2] No");

                            System.out.print("Enter your choice: ");
                            choice = sc.nextByte();

                            if (choice == 1) {
                                System.out.println("\nExiting the Load Registration...| Thank you for coming!");
                            } else if (choice == 2) {
                                break;
                            } else {
                                System.out.println("\nInvalid input. \nPlease try again.\n");
                            }
                            break;
                        default:
                            System.out.println("\nInvalid input. \nPlease try again.\n");
                            break;
                    }
                } else {
                    System.out.println("\nInvalid input. \nPlease try again.\n");
                }
                break;

            // FOR EXIT OPTION
            case 4:
                System.out.println("\nAre you sure you want to exit the Load Registration?");
                System.out.println("     [1] Yes");
                System.out.println("     [2] No");

                System.out.print("Enter your choice: ");
                choice = sc.nextByte(); // choice if they want to exit the program

                if (choice == 1) {
                    System.out.println("\nExiting the Load Registration...| Thank you for coming!\n");
                } else if (choice == 2) {
                    break;
                } else {
                    System.out.println("\nInvalid input. \nPlease try again.\n");
                }
                break;

            default:
                System.out.println("\nInvalid input. \nPlease try again.\n");
                break;
        }
    }
}