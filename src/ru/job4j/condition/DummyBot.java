package ru.job4j.condition;

public class DummyBot {

    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {

            rsl = "Привет, умник.";
        } else if ("Пока".equals(question)) {
            rsl = "До скорой встречи.";

        }
        return rsl;
    }
    public static void main(String[] args) {
        String result1 = DummyBot.answer("Привет, Бот.");
        System.out.println(result1);
        String result2 = DummyBot.answer("Ну, и?");
        System.out.println(result2);
        String result3 = DummyBot.answer("Пока");
        System.out.println(result3);
    }
}
