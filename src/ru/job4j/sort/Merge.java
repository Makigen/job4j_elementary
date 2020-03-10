package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0; //left array index;
        int j = 0; //right array index;
        int k = 0; //rsl array index;
        while (k < rsl.length && i < left.length && j < right.length) {
            if (left[i] >= right[j]) {
                rsl[k++] = right[j++];
            } else if (left[i] < right[j]) {
                rsl[k++] = left[i++];
            }
        } //code below is executed when one of the initial arrays is ended
        while (k < rsl.length && i < left.length) {
            rsl[k++] = left[i++];
        }
        while (k < rsl.length && j < right.length) {
            rsl[k++] = right[j++];
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}