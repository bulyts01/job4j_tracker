package ru.job4j.queue;

import java.util.LinkedList;
import java.util.Queue;

public class AppleStore {
    private final Queue<Customer> queue;
    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        String lastHappyCustomer = "";

        for (int i = 0; i < queue.size(); i++) {
            Customer currentCustomer = queue.poll();
            lastHappyCustomer = currentCustomer.name();
        }

        return lastHappyCustomer;
    }

    public String getFirstUpsetCustomer() {
        int size = queue.size();

        for (int i = 0; i < size; i++) {
            Customer currentCustomer = queue.poll();
            if (i == count) {
                return currentCustomer.name();
            }
        }

        return "";
    }
}
