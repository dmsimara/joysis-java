
package com.stage1;


public class Activity2_Simara_AssignmentOperator {
    
    // Assignment Operator =, +=, -=, *=, /=, %=
    
    public static void main(String[] args) {
        
        // assignment (=)
        int num1 = 36;
        System.out.println("Assignment (=): " + num1);
        
        
        // add and asign (+=)
        num1 += 14;
        System.out.println("Add and Assign (+=): " + num1);
        
        
        // subtract and assign (-=)
        int num2 = 50;
        num2 -= 10;
        System.out.println("Subtract and Assign (-=): " + num2);
        
        
        // multiply and assign (*=)
        int num3 = 50;
        num3 *= 10;
        System.out.println("Multiply and Assign (*=): " + num3);
        
        
        // divide and assign (/=)
        int num4 = 50;
        num4 /= 10;
        System.out.println("Divide and Assign (/=): " + num4);
        
        
        // modulus and assign (%=)
        int num5 = 50;
        num5 %= 12;
        System.out.println("Modulus and Assign (%=): " + num5);
    }
}
