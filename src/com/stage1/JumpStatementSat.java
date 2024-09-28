
package com.stage1;


public class JumpStatementSat {
    public static void main(String[] args) {
        
        // break -> terminate the current statement
        // continue -> skip the current statement
        
        
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                break;
            }
            System.out.println(i);
        } 
        

    }
}
