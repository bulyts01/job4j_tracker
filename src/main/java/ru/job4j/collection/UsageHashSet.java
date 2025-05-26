package ru.job4j.collection;

import java.util.HashSet;
import java.util.Set;

public class UsageHashSet {
    public static void main(String[] args) {
        Set<String> cars = new HashSet<>();
        cars.add("Toyota");
        cars.add("Lexus");
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Mercedes");
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Mercedes");
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Mercedes");
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
