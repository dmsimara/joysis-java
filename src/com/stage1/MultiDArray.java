
package com.stage1;

import java.util.Scanner;


public class MultiDArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the rows: ");
        int sizeRows = sc.nextInt();
        
        System.out.print("Enter the columns: ");
        int sizeColumns = sc.nextInt();
        
        String planets[][] = new String[sizeRows][sizeColumns];
        
        sc.nextLine();
        
        for (int i = 0; i < planets.length; i++) {
            for (int j = 0; j < planets[i].length; j++) {
                System.out.print("Enter the planet: ");
                planets[i][j] = sc.nextLine();
            }
        }
        
        System.out.println("");
        
        for (int i = 0; i < planets.length; i++) {
            for (int j = 0; j < planets[i].length; j++) {
                System.out.println(planets[i][j]);
            }
            System.out.println("");
        }
                
//        // how to declare (syntax): datatype[][] variable = { {20, 25}, {30, 35} }
//        
//        String[][] planets = 
//        {   //  0          1        2       3
//            {"Mercury", "Venus", "Earth", "Mars"}, // 0 
//            {"Jupiter", "Saturn", "Uranus", "Neptune"}  // 1
//        };
//        
//        System.out.println(planets.length);
//        System.out.println(planets[0][2]);
//        
//        for (int i = 0; i < planets.length; i++) {
//            for (int j = 0; j < planets[i].length; j++) {
//                System.out.println(planets[i][j]);
//            }
//            System.out.println("");
//        }
//        
//        System.out.println("\n");
//        
//        for (String planet[] : planets) {
//            for (String element : planet) {
//                System.out.println(element);
//            }
//            System.out.println("");
//        }


    }
    
}
