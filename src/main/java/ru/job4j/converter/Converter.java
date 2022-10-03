package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float euroToRuble(float value) {
        float rsl = value * 70;
        return rsl;
    }

    public static float dollarToRuble(float value) {
        float rsl = value * 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euros.");
        float dollar = Converter.rubleToDollar(160);
        System.out.println("160 rubles are " + dollar + " dollars.");
        float rubleEuro = Converter.euroToRuble(10);
        System.out.println("10 euro are " + rubleEuro + " rubles.");
        float rubleDollar = Converter.dollarToRuble(20);
        System.out.println("20 dollar are " + rubleDollar + " rubles.");
    }
}