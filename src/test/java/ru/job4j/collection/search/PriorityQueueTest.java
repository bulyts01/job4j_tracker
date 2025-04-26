package ru.job4j.collection.search;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PriorityQueueTest {
    @Test
    public void whenHigherPrioritySecond() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        Task result = queue.take();
        assertThat(result.getDescription(), is("urgent"));
    }

    @Test
    public void whenHigherPriorityEquals() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 5));
        queue.put(new Task("middle", 5));
        Task result = queue.take();
        assertThat(result.getDescription(), is("low"));
    }
}
