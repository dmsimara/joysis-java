
package com.stage1;


public class LoopingFriday {
    public static void main(String[] args) {
        
        // fixed size of iterations - for loop
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". Daniella");
        }
        
        System.out.println("\n");
        
        // number of iteration is not fixed - while loop e.g. print white as long as its white
        int i = 0;
        
        while(i < 3) {
            System.out.println((i + 1) + ". Daniella");
            i++;
        }
        
        System.out.println("\n");
        
        // code will execute at least once -> do-while loop 
        int j = 0;
        
        do {
            System.out.println((j + 1) + ". Daniella");
            j++;
        } while (j < 3);
    }
}

