
package com.stage1;


public class Pet {
    
    private int id;
    private String name;
    private int ageInMonths;
    private String breed;
    
    public void setId(int id) {
        id = id;
    }
    
    public void setName(String name) {
        
    }
    
}

    class Main {
        public static void main(String[] args) {
            
            Pet pet = new Pet();
            pet.setId(1001);
        }
    }
