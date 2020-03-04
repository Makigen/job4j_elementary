package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int j = 0; j < data.length; j++) {
        int min = MinDiapason.findMin(data, j, data.length-1);
        int index = FindLoop.indexOf(data, min, j, data.length-1);
        SwitchArray.swap(data, index, j);
        }
        return data;
    }
}