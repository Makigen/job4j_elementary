package ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.Barbell;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BarbellTest {

    @Test
    public void whenMaxWeightIsTwelwe() {
        int[] input = {1, 2, 3, 6};
        int result = Barbell.findMaxWeight(input);
        assertThat(result, is(12));
    }

    @Test
    public void whenMaxWeightIsTwenty() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int result = Barbell.findMaxWeight(input);
        assertThat(result, is(20));
    }

    @Test
    public void whenMaxWeightIsZero() {
        int[] input = {1, 2};
        int result = Barbell.findMaxWeight(input);
        assertThat(result, is(0));
    }

    @Test
    public void whenMaxWeightIsForty() {
        int[] input = {20, 20, 4, 8, 1, 20, 7, 3};
        int result = Barbell.findMaxWeight(input);
        assertThat(result, is(80));
    }
}
