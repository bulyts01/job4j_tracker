package ru.job4j.queue;

import java.util.Queue;
import java.util.function.Consumer;

public class AppleStore {
    private final Queue<Customer> queue;

    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    //должен вернуть имя последнего счастливого обладателя желаемого товара;
    //для решения вам пригодится метод poll(), а также в обоих методах цикл fori;
    public String getLastHappyCustomer() {
        int available = count;
        String lastHappyCustomer = "";
        int size = queue.size();

        for (int i = 0; i < size; i++) {
            Customer currentCustomer = queue.poll();
            available--;
            if (available == 0) {
                lastHappyCustomer = currentCustomer.name();
            }
        }

        return lastHappyCustomer;
    }

    public String getFirstUpsetCustomer() {
        int available = count;
        String upsetCustomer = "";
        int size = queue.size();

        for (int i = 0; i < size; i++) {
            Customer currentCustomer = queue.poll();
            available--;
            if (available == -1) {
                upsetCustomer = currentCustomer.name();
            }
        }

        return upsetCustomer;
    }
}
