
package com.stage1;


public class StringExercise {
    public static void main(String[] args) {
        
        String str = "Philippines";
        
        // Get the first and last character of a String
        System.out.println("1. " + str.charAt(0) + " and " + str.charAt(str.length() -1));
        
        
        // Count the frequency of a character in a String
        int frequency = 0;
        
        char[] charArray = str.toCharArray();

        for (char ch : charArray) {
            if (ch == 'P' || ch == 'p') {
                frequency += 1;
            }
        }
        
        System.out.println("2. " + frequency);
        
        
        // Count the no. of vowels in a String
        int numVowels = 0;
        String setVowels = "aeiouAEIOU";
        
        char[] strArray = str.toCharArray();
        
        for (char ch : strArray) {
            if (setVowels.indexOf(ch) != -1) {
                numVowels += 1;
            }
        }
        
        System.out.println("3. " + numVowels);
    }
}
