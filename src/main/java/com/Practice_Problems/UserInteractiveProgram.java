package com.Practice_Problems;

public class UserInteractiveProgram {

    // BMI calculator
    public static void main(String[] args) {
        System.out.println("BMI: " + calculateBMI(70.0f, 1.75f));
    }

    public static float calculateBMI(float weightInKg, float heightInMeters) {
        return weightInKg / (heightInMeters * heightInMeters);
    }
}
