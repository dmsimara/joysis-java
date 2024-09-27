
package com.stage1;


public class LogicalOperator {
    
    public static void main(String[] args) {
        
        // &&, both statements must be true
        int num1 = 10;
        int num2 = 10;
        
        System.out.println(num1 < num2 && num2 > num1);
        
        // ||, at least one must be true
        int num3 = 10;
        int num4 = 10;
        
        System.out.println(num1 == num2 || num2 > num1);
    }
}
