package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        Point a = new Point(27, 2);
        Point b = new Point(20, 20);
        double out = a.distance(b);
        double expected = 19.31;
        Assert.assertEquals(expected, out, 0.01);
    }
}
