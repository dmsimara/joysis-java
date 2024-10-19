
package com.stage2;


public class MethodsFriday {
    public static void main(String[] args) {
        
        // print your name 20 times
        // compute the tax
        
        displayName("Winter");
        displayName("Summer");
        displayName("Fall");
    }
    
    static void displayName(String name) {
        for (int i = 0; i < 5; i++) {
            System.out.println(name);
        }
    }
    
    // if the parameter doesnt have any value => non-parametherized method
    // if the parameter has value/argument => parametherized method
    // return keyword =? used to return value from method when it has result
    /*
       categories of return types:
         a. void - does not return anything; you can put any data types; no 
                   return statement
         b. data type - any data type; there should be a return statement 
                       (required)
    */
}
