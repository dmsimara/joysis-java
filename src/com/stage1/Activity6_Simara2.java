package com.stage1;

import java.util.Scanner;

public class Activity6_Simara2 {
    public static void main(String[] args) {
        
        // create a multi-dimensional array and traverse each element
        // using nested for loop and for each loop ( enhance for loop ) 
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of group friends: ");
        int groupFriends = sc.nextInt();
        
        System.out.print("Enter the number of friends in each group: ");
        int sizeGroupFriends = sc.nextInt();
        
        String[][] friends = new String[groupFriends][sizeGroupFriends];
        sc.nextLine();
        
        System.out.println("");
        
        for (int i = 0; i < friends.length; i++) {
            for (int j = 0; j < friends[i].length; j++) {
                System.out.print("Enter your friend's name: ");
                friends[i][j] = sc.nextLine();
            }
            System.out.println("");
        }
        
        for (String[] friend : friends) {
            for (String level : friend) {
                System.out.println(level);
            }
            System.out.println("");
        }
    }
}