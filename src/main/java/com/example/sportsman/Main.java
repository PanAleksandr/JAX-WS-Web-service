package com.example.sportsman;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Exercise exercise1 = new Exercise("Push-Ups", 15, 3, 0, false, 'A');
        Exercise exercise2 = new Exercise("Squats", 20, 4, 0, false, 'B');
        Exercise exercise3 = new Exercise("Bench Press", 10, 3, 60.5f, false, 'A');

        Sportsman sportsman = new Sportsman(
                "Ivan", 25, "Boxing", 1.80f, 75.0f, true, 'M',
                Arrays.asList(exercise1, exercise2, exercise3)
        );

        System.out.println(sportsman);
    }
}
