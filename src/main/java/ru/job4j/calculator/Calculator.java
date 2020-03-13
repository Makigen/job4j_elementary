package ru.job4j.calculator;

/**
 * Class for arithmetic calculations.
 * @author Makige
 * @version 1.0
 */
public class Calculator {
    /**
     * Addition.
     * @param first first argument.
     * @param second second argument.
     */
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    /**
     * Main.
     * @param args - args.
     */
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int four = 4;
        int five = 5;
        int six = 6;
        int onePlusTwo = one + two;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        System.out.println(onePlusTwo);
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
        Calculator.plus(1, 2);
    }
}