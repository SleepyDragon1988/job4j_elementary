package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        int s = (p / 2 / (k + 1)) * (p / 2 / (k + 1)) * 2;
        return s;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = " + result1);

    }
}