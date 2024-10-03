
package com.stage1;


public class MathThursday {
    public static void main(String[] args) {
        // if method is static, no need to create an object
        
        int sum = Math.addExact(25, 50);
        System.out.println(sum);
        
        int difference = Math.subtractExact(50, 25);
        System.out.println(difference);
        
        int product = Math.multiplyExact(25, 5);
        System.out.println(product);
        
        int quotient = Math.floorDiv(45, 5);
        System.out.println(quotient);
        
        int absoluteValue = Math.abs(25);
        System.out.println(absoluteValue);
        
        int maxValue = Math.max(50, 49);
        System.out.println(maxValue);
        
        int minValue = Math.min(50, 49);
        System.out.println(minValue);
        
        double sqrt = Math.sqrt(9.0);
        System.out.println(sqrt);
        
        double powerExponent = Math.pow(10, 2);
        System.out.println(powerExponent);
        
        double round = Math.round(58.54);
        System.out.println(round);
        
        int random = (int) (Math.random() * 100);
        System.out.println(random);
    }
}
