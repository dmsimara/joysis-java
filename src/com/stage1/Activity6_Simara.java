
package com.stage1;

import java.util.Scanner;


public class Activity6_Simara {
    public static void main(String[] args) {
        
        // Create a single dimensional array and iterate all the elements in the array you 
        // created using for loop and for each loop ( enhance for loop )
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter how many friends do you have: ");
        int numFriends = sc.nextInt();
        
        String[] friends = new String[numFriends];
        
        sc.nextLine();
        
        for (int i = 0; i < friends.length; i++) {
            System.out.print("Enter your friend's name: ");
            friends[i] = sc.nextLine();
        }
        
        System.out.println("");
        
        for (String friend : friends) {
            System.out.println(friend);
        }
        
        System.out.println("\n");
        
        // 
    }
}
