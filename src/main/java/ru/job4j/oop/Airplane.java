package ru.job4j.oop;

public class Airplane implements Vehicle {
    @Override
    public void motion() {
        System.out.println(getClass().getSimpleName() + " летает по воздуху");
    }

    @Override
    public void seats() {
        System.out.println("У " + getClass().getSimpleName() + " 150 посадочных мест");
    }
}
