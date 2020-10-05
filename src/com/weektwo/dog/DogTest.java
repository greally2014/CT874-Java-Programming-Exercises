package com.weektwo.dog;

public class DogTest {
    // main method
    public static void main(String[] args) {

        // Declaration & creation of LectureDog object
        Dog spot = new Dog();

        // Use the dot operator to set the size
        spot.size = 20;
        spot.breed = "Labrador";
        spot.name = "Spot";

        // Use the dot operator to call the bark method
        spot.bark();
    }
}
