package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        int x1 = 27;
        int x2 = 2;
        int y1 = 20;
        int y2 = 20;
        double out = Point.distance(x1, x2, y1, y2);
        double expected = 19.31;
        Assert.assertEquals(expected, out, 0.01);
    }

}
