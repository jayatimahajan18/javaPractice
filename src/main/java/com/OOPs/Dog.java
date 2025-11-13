package com.OOPs;

public class Dog {

    private int legs;
    private int eyes;
    private String nameOfDog;
    private String colour;
    private float weight;

    public Dog(int legs, int eyes, String nameOfDog, String colour, float weight) {
        this.legs = legs;
        this.eyes = eyes;
        this.nameOfDog = nameOfDog;
        this.colour = colour;
        this.weight = weight;
    }

    public int howManyLegs() {
        return getLegs();
    }

    public String dogColour() {
        return getColour();
    }

    public String dogName() {
        return getNameOfDog();
    }

    public float dogWeight() {
        return getWeight();
    }

    public int dogEyes() {
        return geteyes();
    }

    public int getLegs(){
        return this.legs;
    }
    public void setLegs(int legs){
        this.legs=legs;
    }
    public int geteyes(){
        return this.eyes;
    }
    public void seteyes(int eyes){
        this.eyes=eyes;
    }
    public String getNameOfDog(){
        return this.nameOfDog;
    }
    public void setNameOfDog(String nameOfDog){
        this.nameOfDog=nameOfDog;
    }
    public String getColour(){
        return this.colour;
    }
    public void setColour(String colour){
        this.colour=colour;
    }
    public float getWeight(){
        return this.weight;
    }
    public void setWeight(float weight){
        this.weight=weight;
    }

}
