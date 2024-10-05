
package com.stage1;


public class SaturdayMethod {
    public static void main(String[] args) {
        
        String name = word("Winter");
        System.out.println("Hello, " + name);
        
        int answer = sum(25, 25);
        System.out.println(answer);
        
        boolean result = isLegalAge(24);
        System.out.println(result);
    }
    
//    public void sum() { // void means does not return something
//        
//    }
    
    // return type: data type(String)
    public static String word(String name) {
        return name;
    }
    
    // a method that can perform math equation
    public static int sum(int a, int b) {
        return a + b;
    }
    
    public static boolean isLegalAge(int age) {
        if (age > 17) {
            return true;
        } else {
            return false;
        }
    }
}
