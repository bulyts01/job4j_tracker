package ru.job4j.oop;

public class Bus implements Vehicle {
    @Override
    public void motion() {
        System.out.println(getClass().getSimpleName() + " едет по автомобильной дороге");
    }

    @Override
    public void seats() {
        System.out.println("У " + getClass().getSimpleName() + " 30 посадочных мест");
    }
}
