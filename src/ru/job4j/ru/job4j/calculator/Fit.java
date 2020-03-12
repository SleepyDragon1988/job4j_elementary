package ru.job4j.ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height){
        double result = (height- 100)*1.15;
        return result;
    }
    public static double womanWeight(double height){
        double result = (height- 110)*1.15;
        return result;
    }
    public static void main(String [] args){
        double man = Fit.manWeight(180);
        System.out.println("Man 180 is " + man);
        double woman = Fit.womanWeight(180);
        System.out.println("Woman 180 is " + woman);
    }
}
