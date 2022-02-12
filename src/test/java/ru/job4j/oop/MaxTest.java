package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax15To12To20Then20() {
        int first = 15;
        int second = 12;
        int third = 20;
        int result = Max.max(first, second, third);
        int expected = 20;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax8To12To30To29Then12() {
        int first = 8;
        int second = 12;
        int third = 30;
        int forth = 29;
        int result = Max.max(first, second, third, forth);
        int expected = 30;
        Assert.assertEquals(result, expected);
    }

}