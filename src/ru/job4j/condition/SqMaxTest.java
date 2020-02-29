package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenMax6475Then7() {
        int result = SqMax.max(6, 4, 7, 5);
        assertThat(result, is(7));
    }
    @Test
    public void whenMax1234Then4() {
        int result = SqMax.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }
    @Test
    public void whenMax6543Then6() {
        int result = SqMax.max(6, 5, 4, 3);
        assertThat(result, is(6));
    }
    @Test
    public void whenMax1987Then9() {
        int result = SqMax.max(1, 9, 8, 7);
        assertThat(result, is(9));
    }
    @Test
    public void whenMax1243Then4() {
        int result = SqMax.max(1, 2, 4, 3);
        assertThat(result, is(4));
    }
}