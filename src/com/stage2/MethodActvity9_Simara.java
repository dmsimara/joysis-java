
package com.stage2;


public class MethodActvity9_Simara {
    public static void main(String[] args) {
        
//        oddOrEven(205);
//        nameRepeat("Dani");
//          System.out.println(squareRoot(64));
//          double results = powerNum(10, 2);
//          System.out.println(results);
//          randomNum();
//          System.out.println(areaCircle(6));
//          voterOrNot(19);
//          lengthWord("Philippines");
//          System.out.println(reverseWord("Ella"));
//          info("Daniella", 19);

    }
    
    // - a method to identify if a number is odd or even
    public static void oddOrEven (int a) {
        
        if (a % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
    
    // - a method to print your name 50 times
    public static void nameRepeat (String name) {
        
        for (int i = 0; i < 50; i++) {
            System.out.println(name);
        }
    }
    
    // - a method to get the square root of a certain variable
    public static double squareRoot (double num) {
        
//        double results = Math.sqrt(num);
        
        return Math.sqrt(num);
    } 
    
    // - a method to get the power of a number using base and exponent
    public static double powerNum (double a, double b) {
        
        return Math.pow(a, b);
    }
    
    // - a method to print a random number between 1 and 100
    public static void randomNum () {
        
        int random = (int) (Math.random() * 100);
        System.out.println(random);
    }
    
    // - a method to get the area of a circle using the given radius
    public static double areaCircle (double a) {
        return Math.PI * Math.pow(a, 2);
    }
    
    // - a method to identify if a person is a voter or not
    public static void voterOrNot (int age) {
        
        // based on research the oldest man alive is 116y/o
        if (age <= 116 && age >= 18) {
            System.out.println("You're a voter.");
        } else if (age > 0 && age < 18) {
            System.out.println("You're not a voter");
        } else {
            System.out.println("Invalid input.");
        }
    }
    
    // - a method to get the length of a certain word
    public static void lengthWord (String word) {
        
        System.out.println(word.length());
    }

    // - a method to print a certain word in reverse order    
    public static String reverseWord(String word) {
        
        String reversed = "";
        
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        
        return reversed;
    }
    
    // - a method to print your full name and age
    public static void info (String name, int age) {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }
}
