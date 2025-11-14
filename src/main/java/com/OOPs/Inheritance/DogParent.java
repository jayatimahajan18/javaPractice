package com.OOPs.Inheritance;

public class DogParent {
    private String breed;
    private String barkSound;

    public void sound(){
        System.out.println("The dog barks: " + this.barkSound); 
    }
    public void typeOfDog(){
        System.out.println("The breed of the dog is: " + this.breed);
    }
    //getter & setter
    public String getBreed(){
        return this.breed;
    }
    public void setBreed(String breed){
        this.breed= breed;
    }
    public String getBarkSound(){
        return this.barkSound;
    }
    public void setBarkSound(String barkSound){
        this.barkSound= barkSound;
    }
    
}
