package ru.job4j.array;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class EndsWithTest {

    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }

    @Test
    public void whenNotEndWithPrefixThenFalse2() {
        char[] word = {'M', 'e', 't', 'r', 'o', 'p', 'o', 'l', 'i', 't', 'a', 'n'};
        char[] pref = {'l', 't', 'a', 'n'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, Is.is(false));
    }
}