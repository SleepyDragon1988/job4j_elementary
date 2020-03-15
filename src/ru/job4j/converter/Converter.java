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
        int in = 140;
        int expected = 2;
        int out = rubletoEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        int in2 = 120;
        int expected2 = 2;
        int out2 = rubletoDollar(in);
        boolean passed2 = expected2 == out2;
        System.out.println("120 rubles are 2. Test result : " + passed);

        int euro = Converter.rubletoEuro(140);
        System.out.println("140 rubles are" + euro + " euro.");
        int dollar = Converter.rubletoDollar(120);
        System.out.println("120 rubles are " + dollar + " dollars.");
    }
    public static int DollarToruble(int value) {
        return value * 60;
    }
    public static int EuroToruble(int value) {
        return value * 70;
    }
}
