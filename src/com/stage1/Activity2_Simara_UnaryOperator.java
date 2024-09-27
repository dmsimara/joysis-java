
package com.stage1;


public class Activity2_Simara_UnaryOperator {
    
    // Unary Operator ++, --, !
    
    public static void main(String[] args) {
        
        // increment (++)
        int num1 = 10;
       
        System.out.println("Pre-increment: " + (++num1));
        System.out.println("Post-increment: " + (num1++));
        System.out.println("Second Post-increment: " + (num1++));
        
        System.out.println(" ");
        
        // decrement (--)
        int num2 = 10;
        
        System.out.println("Pre-decrement: " + (--num2));
        System.out.println("Post-decrement: " + (num2--));
        System.out.println("Second Post-decrement: " + (num2--));
        
        System.out.println(" ");
        
        // logical NOT (!)
        boolean isJavaFun = false;
        
        System.out.println(!isJavaFun);
    }
    
}
