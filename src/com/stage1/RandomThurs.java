
package com.stage1;

import java.util.Random;


public class RandomThurs {
    public static void main(String[] args) {
        
        /*
        // Bingo Simulator
        
        Random random = new Random();
        
        int roll = random.nextInt(75) + 1;
        String letter;
        
        if (roll < 16) {
            letter = "B";
        } else if (roll < 31) {
            letter = "I";
        } else if (roll < 46) {
            letter = "N";
        } else if (roll < 61) {
            letter = "G";
        } else {
            letter = "O";
        }
        
        System.out.println("Sa letra ng " + letter + " : " + roll); */
        
        Random random = new Random();
        
        for (int i = 0; i < 7; i++) {
            System.out.println(random.nextInt(58) + 1);
        }
    }
}
