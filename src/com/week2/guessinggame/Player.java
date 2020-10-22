package com.week2.guessinggame;

public class Player {

    // Instance variable
    int number;
    boolean isRight = false;

    // Instance method
    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }
}
