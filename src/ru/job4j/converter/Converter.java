package ru.job4j.converter;

public class Converter {
    public static int rubletoEuro(int value){
        int rsl = value/70;
        return rsl;
    }
    public static int rubletoDollar(int value){
        int rsl = value/60;
        return rsl;
    }

    public static void main(String [] args){
        int euro = Converter.rubletoEuro(140);
        System.out.println("140 rubles are" + euro + " euro.");
        int dollar = Converter.rubletoDollar(120);
        System.out.println("120 rubles are" + dollar + " dollars.");
    }
    public static int DollarToruble(int value) {
        return value * 60;
    }
    public static int EuroToruble(int value) {
        return value * 70;
    }
}
