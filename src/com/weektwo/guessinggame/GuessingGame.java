package com.weektwo.guessinggame;

public class GuessingGame {

    // Instance method
    public void startGame() {

        // Creating and assigning Player objects
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;

        // Random number needed to win game
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        while (true) {
            System.out.println("Number to guess is " + targetNumber);

            // Player guess method
            p1.guess();
            p2.guess();
            p3.guess();

            // Assigning the players' guesses
            int guessP1 = p1.number;
            int guessP2 = p2.number;
            int guessP3 = p3.number;

            // Checking win condition for each player
            if (guessP1 == targetNumber) {
                p1IsRight = true;
            }
            if (guessP2 == targetNumber) {
                p2IsRight = true;
            }
            if (guessP3 == targetNumber) {
                p3IsRight = true;
            }

            // Announcing the winner(s) and ending the game
            if (p1IsRight || p2IsRight || p3IsRight) {
                System.out.println("We have a winner!");
                System.out.println("Is Player1 right? " + p1IsRight);
                System.out.println("Is Player2 right? " + p2IsRight);
                System.out.println("Is Player3 right? " + p3IsRight);
                System.out.println("Game over...");
                break;
                // If no winner, repeat until a player wins
            } else {
                System.out.println("Players will have to try again...");
            }
        }
    }
}
