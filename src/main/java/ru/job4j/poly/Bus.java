package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public String drive() {
        return null;
    }

    @Override
    public int passengers(int count) {
        return 0;
    }

    @Override
    public double refuel(double fuel) {
        double price = 53.50;
        return price * fuel;
    }
}
