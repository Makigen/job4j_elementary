package ru.job4j.array;

public class BarleyBreak {
    public static void main(String[] args) {
        int[][] numbers = new int[3][3];
        int k = 1;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
            numbers[i][j] = k;
            k++;
            System.out.print(numbers[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
