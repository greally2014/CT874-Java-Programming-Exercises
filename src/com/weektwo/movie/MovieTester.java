package com.weektwo.movie;

public class MovieTester {

    public static void main(String[] args) {

        Movie one = new Movie();
        one.title = "Gone with the Wind";
        one.genre = "Romance";
        one.rating = 7;

        Movie two = new Movie();
        two.title = "White Chicks";
        two.genre = "Black Comedy";
        two.rating = 9;

        two.playIt();
    }
}
