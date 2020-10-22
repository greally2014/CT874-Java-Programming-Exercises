package com.week2.guessinggame;

public class GuessingGame {

    // Instance method
    public void startGame() {

        // Creating and assigning Player objects
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        // Random number needed to win game
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        while (true) {
            System.out.println("Number to guess is " + targetNumber);

            // Player guess method
            p1.guess();
            p2.guess();
            p3.guess();

            // Checking win condition for each player
            if (p1.number == targetNumber) {
                p1.isRight = true;
            }
            if (p2.number == targetNumber) {
                p2.isRight = true;
            }
            if (p3.number == targetNumber) {
                p3.isRight = true;
            }

            // Announcing the winner(s) and ending the game
            if (p1.isRight || p2.isRight || p3.isRight) {
                System.out.println("We have a winner!");
                System.out.println("Is Player1 right? " + p1.isRight);
                System.out.println("Is Player2 right? " + p2.isRight);
                System.out.println("Is Player3 right? " + p3.isRight);
                System.out.println("Game over...");
                break;
                // If no winner, repeat until a player wins
            } else {
                System.out.println("Players will have to try again...");
            }
        }
    }
}
