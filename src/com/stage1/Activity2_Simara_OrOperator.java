
package com.stage1;


public class Activity2_Simara_OrOperator {
    
    // OR Operator ||
    
    public static void main(String[] args) {
        
        int num1 = 100;
        int num2 = 50;
        
        System.out.println((num1 > num2) || (num1 < num2)); // first condition is true = true
        System.out.println((num1 == num2) || (num1 < num2)); // both condition are false = false
        System.out.println((num2 >= num1) || (num1 != num2)); // second condition is true = true
    }

}
