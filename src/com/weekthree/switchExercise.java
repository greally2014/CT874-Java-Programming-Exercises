package com.weekthree;
import java.util.Scanner;

public class switchExercise {
    public static void main(String[] args) {
        int gradeLevel;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year (First Year - 1, Second Year - 2, ...");
        gradeLevel = Integer.parseInt(scanner.nextLine());

        switch (gradeLevel) {
            /* These arrows prevent having to use break statements to avoid fall-through */
            /* You can now use switch expressions and have switch cases yield values to be assigned to variables */
            /* Enhanced switches can now be used for expressions as well as statements */
            /* You can now use {} to create scopes within the switch block */
            case 1 -> System.out.println("Go to IT125");
            case 2 -> System.out.println("Go to the Cairnes Theatre");
            case 3 -> System.out.println("Go to the Larmor Theatre");
            case 4 -> System.out.println("Go to the Quadrangle");
            default -> System.out.println("Input error: Invalid Data");
        }
    }
}
