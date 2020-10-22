package com.week3.book;

public class BookTester {

    public static void main(String[] args) {
        Book b = new Book();
        Book c = new Book();
        Book d = c;

        b.setTitle("A Game of Thrones");
        c.setTitle("Winds of Winter");
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        c = b;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        b.setTitle("A Game of Thrones");
        c.setTitle("Winds of Winter");
        System.out.println(b);
        System.out.println(c);

        b = c;
        System.out.println(b);

        c = null;
        System.out.println(c);
        // Throws java.lang.NullPointerException
    }
}
