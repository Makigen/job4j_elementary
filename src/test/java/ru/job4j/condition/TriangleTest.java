package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;
import ru.job4j.condition.Triangle;

public class TriangleTest {
    @Test
    public void whenAreaIs2() {
        Point ap = new Point(0, 0);
        Point bp = new Point(0, 2);
        Point cp = new Point(2, 0);
        Triangle test = new Triangle(ap, bp, cp);
        double out = test.area();
        double expected = 2;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenTriangleDoesNotExist() {
        Point ap = new Point(0, 0);
        Point bp = new Point(0, 2);
        Point cp = new Point(0, 3);
        Triangle test = new Triangle(ap, bp, cp);
        double out = test.area();
        double expected = -1;
        Assert.assertEquals(expected, out, 0);
    }
}