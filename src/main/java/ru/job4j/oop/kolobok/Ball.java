package ru.job4j.oop.kolobok;

public class Ball {

    public void tryRun(boolean condition) {
        if (condition) {
            System.out.println("The Kolobok was eaten");
        } else {
            System.out.println("Kolobok ran away");
        }
    }

}
