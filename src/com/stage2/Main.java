
package com.stage2;


public class Main {
    public static void main(String[] args) {
        
        Sun sun = new Sun();
        System.out.println(sun.hasLight);
        
        Moon moon = new Moon();
        System.out.println(moon.hasLight);
        System.out.println(moon.hasCraters);
        
        Earth earth = new Earth();
        System.out.println(earth.hasLight);
    }
}
