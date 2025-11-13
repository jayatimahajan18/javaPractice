package com.OOPs;

public class DogTest {
    public static void main(String[] args) {
        Dog dog1= new Dog(4,2,"Bro","Brown",30.85f);
        Dog dog2= new Dog(5,1,"Dude","Black",25.0f);

        int legs=dog1.howManyLegs();
        System.out.println("Number of legs of dog1: "+legs);

        int legs2=dog2.howManyLegs();
        System.out.println("Number of legs of dog2: "+legs2);

        dog1.legs=3; //modifying the legs of dog1
        System.out.println("Updated number of legs of dog1: "+dog1.howManyLegs());

    }

}
