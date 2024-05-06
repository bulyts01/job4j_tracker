package ru.job4j.oop;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PointTest {

    @Test
    public void when00To20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        assertThat(dist, closeTo(2, 0.01));
    }

    @Test
    public void when20To55Then5dot83() {
        Point a = new Point(2, 0);
        Point b = new Point(5, 5);
        double dist = a.distance(b);
        assertThat(dist, closeTo(5.83, 0.01));
    }

    @Test
    public void when55To11Then5dot65() {
        Point a = new Point(5, 5);
        Point b = new Point(1, 1);
        double dist = a.distance(b);
        assertThat(dist, closeTo(5.65, 0.01));
    }

    @Test
    public void when111To232Then2dot23() {
        Point a = new Point(1, 1, 1);
        Point b = new Point(2, 3, 2);
        double dist = a.distance3d(b);
        assertThat(dist, closeTo(2.44, 0.01));
    }

    @Test
    public void when555To300Then7dot34() {
        Point a = new Point(5, 5, 5);
        Point b = new Point(3, 0, 0);
        double dist = a.distance3d(b);
        assertThat(dist, closeTo(7.34, 0.01));
    }
}