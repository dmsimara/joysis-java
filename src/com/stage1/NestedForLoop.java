
package com.stage1;


public class NestedForLoop {
    public static void main(String[] args) {
        
        /* for (int i = 0; i < 2; i++) { // outer loop
            for (int j = 0; j < 2; j++) { // inner loop
                System.out.println(i + " " + j);
            }
            System.out.println("");
        } */ // example 1
        
        /*for (int i = 1; i <= 3; i++) {
            System.out.println(i);
            for (int j = 1; j <= i; j++) {
                System.out.println("\t" + j);
            }
        }*/ // example 2
        
        for (int i = 1; i <= 5; i++) {
//            System.out.println("");
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
             System.out.println("");
        }
        
        System.out.println("");
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
