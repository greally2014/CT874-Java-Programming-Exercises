package com.week3.book;

public class Book {

    private String title;

    public Book () {
        title = "unassigned";
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String t) {
        this.title = t;
    }

    @Override
    public String toString() {
        return this.title;
    }
}
