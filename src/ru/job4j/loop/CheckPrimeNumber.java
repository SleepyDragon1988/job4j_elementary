package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number==1) {
            prime = false;
        }
        for (int index = 2; index < number ; index++) {
            if (number % index==0) {
                prime = false;
                break;
            }

        }
        return prime;
    }
    public static void main (String[]args) {
        boolean ChPrNu= check(5);
        if (ChPrNu == false) {
            System.out.println("5 число не простое");

        } else {
            System.out.println("5 число простое");
        }
        System.out.println(ChPrNu);
        boolean ChPrNu2= check(4);
        System.out.println(ChPrNu2);
        boolean ChPrNu3= check(1);
        System.out.println(ChPrNu3);

    }
}