package com.week3;

public class ArrayExample {

    public static void main(String[] args) {
        int[] nums; // declare array variable

        // create an int array and assign it to the int[] variable nums
        nums = new int[7];

        for (int i=0; i<7; i++) {
            nums[i] = i;
        }

        for (int number : nums) {
            System.out.println(number);
        } // end loop
    } // end method
} // end class
