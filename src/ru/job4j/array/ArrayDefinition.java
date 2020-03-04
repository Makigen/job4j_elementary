package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        String[] names = new String[4];
        float[] prices = new float[40];

        names[0] = "Petr Arsentev";
        names[1] = "Kirill Malikov";
        names[2] = "Vladimir Putin";
        names[3] = "Kersti Kaljulaid";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
