package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {
    @Test
    public void square() {
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        double expected = 2.0;
        Assert.assertEquals(expected, out, 0.01);
    }
}
