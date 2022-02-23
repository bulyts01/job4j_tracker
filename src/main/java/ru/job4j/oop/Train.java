package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void motion() {
        System.out.println(getClass().getSimpleName() + " едет по железной дороге");
    }

    @Override
    public void seats() {
        System.out.println("У " + getClass().getSimpleName() + " 700 посадочных мест");
    }
}
