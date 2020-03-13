package ru.job4j.condition;

import org.junit.Test;
import ru.job4j.condition.MultiMax;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(5, 4, 3);
        assertThat(result, is(5));
    }
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }
    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 2, 3);
        assertThat(result, is(3));
    }
    @Test
    public void whenAllEqual() {
        MultiMax check = new MultiMax();
        int result = check.max(99, 99, 99);
        assertThat(result, is(99));
    }
}