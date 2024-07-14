package org.example.e29;

public class E29ClassifyAnimalsElseIf {
    public static void main(String[] args) {
        // Declare a string variable and assign a value
        String animal = "dog";

        // Use if-else-if conditions to classify the animal
        if (animal.equals("dog")) {
            System.out.println("The animal is a mammal.");
        }else if (animal.equals("eagle")) {
            System.out.println("The animal is a bird.");
        }else if (animal.equals("shark")) {
            System.out.println("The animal is a fish.");
        }else if (animal.equals("frog")) {
            System.out.println("The animal is a amphibian.");
        }else if (animal.equals("snake")) {
            System.out.println("The animal is a reptile.");
        }else{
            System.out.println("Unknown animal type.");
        }
    }
}