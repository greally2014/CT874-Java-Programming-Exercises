package com.week4;

public class Dog {

    int size;

    public Dog(int size) {
        this.size = size;
    }

    void bark() {
        if (this.size > 50) {
            System.out.println("Wooof! Wooof!");
        } else if (size > 22) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}
