
package com.stage1;


public class Exercise4_Simara {
    public static void main(String[] args) {
        // Create program that has a method name summation
        // It needs to accept an array of integers
        // then return the sum of the given array
        
        int[] numbers = {5, 10, 15, 20, 25};
        
        int result = summation(numbers);
        
        System.out.println("Sum: " + result);
    }
    
    public static int summation(int[] numbers) {
        
        int sum = 0;
        
        for (int num : numbers) {
            sum += num;
        }
        
        return sum;
    }
}
