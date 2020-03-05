package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double total = amount + (amount * percent / 100);
        while (total > 0) {
            year++;
            total = (total - salary) * percent / 100 + total - salary;
        }
        return year;
    }
}