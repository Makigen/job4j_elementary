package ru.job4j.array;

public class Barbell {
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int findMinOdd(int[] array) {
        int minOdd = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minOdd && array[i] % 2 > 0) {
                minOdd = array[i];
            }
        }
        return minOdd;
    }

    public static int findSum(int[] array) {
        int sum = 0;
        int i = 0;
        while (i < array.length && sum <= 10000) {
            sum += array[i++];
        }
        return sum;
    }

    public static int findMaxWeight(int[] array) {
        int maxWeight = 0;
        if (findSum(array) % 2 == 0 && findSum(array) - findMax(array) >= findMax(array)) {
            maxWeight = findSum(array);
        } else if (findSum(array) - findMax(array) >= findMax(array)) {
            maxWeight = findSum(array) - findMinOdd(array);
        }
        return maxWeight;
    }

    public static void main(String[] args) {
        Barbell barbell = new Barbell();
        int[] input = {1, 2, 3, 6, 4, 8, 5};
        System.out.println(barbell.findMax(input));
        System.out.println(barbell.findMinOdd(input));
        System.out.println(barbell.findSum(input));
        System.out.println(barbell.findMaxWeight(input));
    }
}
