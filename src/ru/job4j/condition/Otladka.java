package ru.job4j.condition;

public class Otladka {

    public static boolean exist(double ab, double ac, double bc) {

        if ((ab + ac > bc) && (ac + bc > ab) && (ab + bc > ac) == true) {
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        boolean yes = Otladka.exist(2.0, 2.0, 2.0);
        String vyvod = yes? "треугольник с заданным сторонами существует" : "треугольник с заданным сторонами не существует";
        System.out.println(vyvod);
    }
}