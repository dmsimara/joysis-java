
package com.stage1;


public class Activity7_Simara {
    public static void main(String[] args) {
        
        String str = "Philippines"; // String literal
        
        System.out.println(".charAt(): " + str.charAt(3)); 
        System.out.println(".length(): " + str.length());
        System.out.println(".toLowerCase(): " + str.toLowerCase());
        System.out.println(".toUpperCase(): " + str.toUpperCase());
        System.out.println(".startsWith(): " + str.startsWith("W"));
        System.out.println(".endsWith(): " + str.endsWith("s"));
        System.out.println(".isEmpty(): " + str.isEmpty());
        System.out.println(".replace(): " + str.replace(str, "South Korea"));
    }
}
