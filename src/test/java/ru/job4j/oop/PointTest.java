package ru.job4j.oop;

import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PointTest {

    @Test
    public void when00To20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        assertThat(dist).isCloseTo(2, Percentage.withPercentage(0.1));
    }

    @Test
    public void when20To55Then5dot83() {
        Point a = new Point(2, 0);
        Point b = new Point(5, 5);
        double dist = a.distance(b);
        assertThat(dist).isCloseTo(5.83, Percentage.withPercentage(0.1));
    }

    @Test
    public void when55To11Then5dot65() {
        Point a = new Point(5, 5);
        Point b = new Point(1, 1);
        double dist = a.distance(b);
        assertThat(dist).isCloseTo(5.65, Percentage.withPercentage(1));
    }

    @Test
    public void when111To232Then2dot23() {
        Point a = new Point(1, 1, 1);
        Point b = new Point(2, 3, 2);
        double dist = a.distance3d(b);
        assertThat(dist).isCloseTo(2.44, Percentage.withPercentage(1));
    }

    @Test
    public void when555To300Then7dot34() {
        Point a = new Point(5, 5, 5);
        Point b = new Point(3, 0, 0);
        double dist = a.distance3d(b);
        assertThat(dist).isCloseTo(7.34, Percentage.withPercentage(1));
    }
}