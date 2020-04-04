package ru.job4j.condition;

public class MiltiMaxTest {
    public static int max(int first, int second, int third) {
        return (first>second)&&(first>third)?first:(second>first)&&(second>third)?second:third;


    }
    public static void main(String[] args) {
        System.out.println(max(1, 4, 2));
    }
}