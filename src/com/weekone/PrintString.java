package com.weekone;

import java.util.Scanner;

public class PrintString {

    public static void main(String[] args) {

        // Declare variable
        String name;

        // Declare, create and assign Scanner object
        Scanner reader = new Scanner(System.in);

        // Request input
        System.out.print("Enter your name: ");

        // Taking input and assigning to variable name
        name = reader.nextLine();
        reader.close();

        // Output to std. output
        System.out.println(name + " says hello world!");
    }
}
