package com.OOPs.Inheritance;

public class SingleInheritance {
    public static void main(String[] args){
        SingleInheritance inheritance= new SingleInheritance();
        PuppyChild puppyChild= new PuppyChild();
        inheritance.setPuppyDetails(puppyChild);
        puppyChild.feelings();
        puppyChild.puppyInfo();
        puppyChild.typeOfDog();
        puppyChild.sound();

    }
    public void setPuppyDetails(PuppyChild puppyChild){
        //set values
        puppyChild.setGender("Male");
        puppyChild.setAge(10);
        puppyChild.setBreed("Indian");
        puppyChild.setBarkSound("bho bho");
    }
    
}
