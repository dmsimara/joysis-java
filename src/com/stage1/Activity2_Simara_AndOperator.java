
package com.stage1;


public class Activity2_Simara_AndOperator {
    
    // AND Operator &&
    
    public static void main(String[] args) {
        
        int num1 = 100;
        int num2 = 50;
        
        System.out.println((num1 > num2) && (num1 < num2)); // second condition is false = false
        System.out.println((num1 > num2) && (num2 < num1)); // both condition are true = true
        System.out.println((num1 == num2) && (num1 > num2)); // first condition is false = false
        System.out.println((num1 < num2) && (num1 == num2)); // both condition are false = false
    }
}
