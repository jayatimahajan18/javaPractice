package com.OOPs.Inheritance;

public class PuppyChild extends DogParent {
    private int age;
    private String gender;
    

    public void puppyInfo(){
        System.out.println("The puppy is a " + getGender() + " and is " + getAge() + " months old.");
    }
    public void feelings(){
        System.out.println("The puppy is happy and playful.");
    }

    //getter & setter
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getGender(){
        return this.gender;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
}
