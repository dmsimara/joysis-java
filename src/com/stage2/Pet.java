
package com.stage2;


public class Pet {
    
    private int id;
    private String name;
    private int ageInMonths;
    private String breed;
    private String owner;
    
    // alt + insert
    
    public Pet(int id, String name, int ageInMonths, String breed, String owner) {
        this.id = id;
        this.name = name;
        this.ageInMonths = ageInMonths;
        this.breed = breed;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgeInMonths() {
        return ageInMonths;
    }

    public void setAgeInMonths(int ageInMonths) {
        this.ageInMonths = ageInMonths;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    
}
