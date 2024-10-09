
package com.stage1;

import java.util.Scanner;


public class Exercise2_Simara {
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
    }
            
}
