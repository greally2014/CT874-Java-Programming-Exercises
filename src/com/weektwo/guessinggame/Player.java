package com.weektwo.guessinggame;

public class Player {

    // Instance variable
    int number;

    // Instance method
    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }
}
