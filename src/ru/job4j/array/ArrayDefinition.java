package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] age = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        /**
         * второе задание
         */
        String[] names = new String[4];
        names[0]="1";
        names[1]="2";
        names[2]="3";
        names[3]="4";

        System.out.println(names);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
