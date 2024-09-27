
package com.stage1;


public class ArithmeticOperator {
    
    public static void main(String[] args) {
        /*byte num1 = 10;
        byte num2 = 20;
        int answer = num1 - num2;
        
        System.out.println("The sum of the two numbers: " + (num1 + num2));
        System.out.println("The difference of the two numbers: " + answer);
        */
        
        int number = 13;
        boolean isOddOrEven = number % 2 == 0;
        
        System.out.println(isOddOrEven);
        
        
        int year = 2028;
        boolean isLeapYear = year % 4 == 0;
        
        System.out.println(isLeapYear);
    }
}
