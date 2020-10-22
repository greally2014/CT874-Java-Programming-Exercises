package com.weekthree;

public class doWhile {
    public static void main(String[] args) {

        int sum = 0, number = 1;

        do {
            /* Executes the block at least once. Checks condition at the end of the cycle. */
            sum += number;
            number++;
        } while (sum <= 100000);

        System.out.println(number);
    }
}
