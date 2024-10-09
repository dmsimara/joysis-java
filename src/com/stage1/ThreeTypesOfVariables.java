
package com.stage1;


public class ThreeTypesOfVariables {
    
    static boolean isLegalAge = true;
    
    public static void main(String[] args) {
        
        // local variable -> inside a method
        double num = 1;
    }
    
    public void sum() {
//        float temp = 20.5; // you cant access temp in other methods
    }
}

/*
 static variable -> can be found outside of the method only bc it 
 belongs to a class which also implies that this can be accessed in 
 any method (global variable)
*/