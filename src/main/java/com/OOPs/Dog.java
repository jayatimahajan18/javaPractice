package com.OOPs;

public class Dog {

    int legs;
    int eyes;
    String nameOfDog;
    String colour;
    float weight;
    public Dog(int legs, int eyes, String nameOfDog, String colour, float weight){
        this.legs=legs;
        this.eyes=eyes;
        this.nameOfDog=nameOfDog;
        this.colour=colour;
        this.weight=weight;
    }

    public int howManyLegs(){
        return this.legs;
    }
    public String dogColour(){
        return this.colour;
    }
    public String dogName(){
        return this.nameOfDog;
    }
    public float dogWeight(){
        return this.weight;
    }
    public int dogEyes(){
        return this.eyes;
    }

}
