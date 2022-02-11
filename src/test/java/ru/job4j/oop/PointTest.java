package ru.job4j.oop;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class PointTest extends TestCase {

    @Test
    public void when00To20Then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when20To55Then5dot83() {
        double expected = 5.83;
        Point a = new Point(2, 0);
        Point b = new Point(5, 5);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when55To11Then5dot65() {
        double expected = 5.65;
        Point a = new Point(5, 5);
        Point b = new Point(1,1);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
}