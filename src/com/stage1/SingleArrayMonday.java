
package com.stage1;

import java.util.Scanner;


public class SingleArrayMonday {
    public static void main(String[] args) {
        
//        int[] ages = {24, 26, 21, 22, 21};
//        System.out.println(ages[0]);
        
        // error is not seen, only in execution -> runtime exception
        // errors are visible, red marks -> compilation error
        
        try {
            int[] ages = {24, 26, 21, 22, 21};
            System.out.println(ages[0]);

            // length 
            System.out.println(ages.length);

            // length member
            System.out.println(ages[ages.length - 1]);
        } catch (Exception e) {
            System.out.println(e);
        }
        
//        // another way to instantiate an array; mostly used with Scanner
//        String[] names = new String[5];
//        
//        names[0] = "Gerald";
//        names[1] = "Kristian";
//        names[2] = "Leny";
//        names[3] = "Prince";
//        names[4] = "Paul";
//        
//        System.out.println(names[4]);
//        
//        // to print all the values
//        
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }
//        
//        // transvering an Array using Enhance For Loop
//        for (String name : names) {
//            System.out.println(name);
//        }
        
        // using Scanner for arrays
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of fruits: ");
        int sizeOfFruits = sc.nextInt();
        String[] fruits = new String[sizeOfFruits];
        
        sc.nextLine(); // this is use whenever Scanner has a bug
        
        for (int i = 0; i < fruits.length; i++) {
            System.out.print("Enter the fruit: ");
            fruits[i] = sc.nextLine();
        }
        
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
     }
}
