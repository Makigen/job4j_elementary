package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) { // проверить, что эталон больше, чем элемент. записать в эталон элемент массива.
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        return min;
    }
}