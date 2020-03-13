package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;

public class PointTest {
    @Test
    public void distance() {
        Point a = new Point(27, 2);
        Point b = new Point(20, 20);
        double out = a.distance(b);
        double expected = 19.31;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3d() {
        Point a = new Point(1, 2, 3);
        Point b = new Point(4, 5, 6);
        double out = a.distance3d(b);
        double expected = 5.19;
        Assert.assertEquals(expected, out, 0.01);
    }
}
