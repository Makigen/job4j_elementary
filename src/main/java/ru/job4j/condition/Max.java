package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int first, int second, int third) {
        int result = max(max(first, second), third);
        return result;
    }

    public static int max(int first, int second, int third, int forth) {
        int result = max(max(first, second, third), forth);
        return result;
    }
}