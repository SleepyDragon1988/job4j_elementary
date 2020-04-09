package ru.job4j.converter;

/**
 * @author Илья
 * @since 2020
 * @version 1
 */
public class Converter {
    /**
     * деление
     * @param value значение в рублях
     * @return деление рублей на курс евро
     */
    public static int rubletoEuro(int value){
        int rsl = value/70;
        return rsl;
    }

    /**
     *
     * @param value
     * @param value значение в рублях
     * @return деление рублей на курс доллара
     */
    public static int rubletoDollar(int value){
        int rsl = value/60;
        return rsl;
    }

    /**
     * умножение
     * @param args вызов методов rubletoDollar и rubletoEuro и передача значений параметрам
     */
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
