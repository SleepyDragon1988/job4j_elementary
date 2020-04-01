package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean yes = left>right;
        int result = yes ? left : right;
        return result;
    }

}

public static void main(String[] args) {
    String msg = Max.max(9, 4);
    System.out.println("максимальное из введеных значений равно ", msg);
}