
package com.stage1;


public class TernaryOperator {
    
    public static void main(String[] args) {
        
        // syntax -> structure of code
        
        // (condition) ? code if cond is true : execute if cond. is false
        
        int num1 = 10;
        int num2 = 20;
        
        System.out.println((num1 < num2) ? num1 : num2);
        
        // determine if num is odd or even
        int number = 50;
        
        String oddOrEven = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(oddOrEven);
        
        
    }
}
