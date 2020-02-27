package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; // формула перевода рублей в доллоры.
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(540);
        int dollar = Converter.rubleToDollar(540);
        System.out.println("540 RUB are " + euro + " EUR.");
        System.out.println("540 RUB are " + dollar + " USD.");
    }
}