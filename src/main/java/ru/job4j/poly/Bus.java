package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + " едет по автомобильной дороге");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Число пассажиров в " + getClass().getSimpleName() + " равно " + count);
    }

    @Override
    public double refuel(double fuel) {
        double price = 53.5;
        return price * fuel;
    }
}
