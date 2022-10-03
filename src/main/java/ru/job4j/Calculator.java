package ru.job4j;

public class Calculator {
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int onePlusTwo = one + two;

        int six = 6;
        int four = 4;
        int five  = 5;
        int sixDivTwo, fiveMinusTwo, fourTimeTwo;

        sixDivTwo = six / two;
        fiveMinusTwo = five - two;
        fourTimeTwo = four * two;
        System.out.println(onePlusTwo);

        System.out.println("sixDivTwo=" + sixDivTwo);
        System.out.println("fiveMinusTwo=" + fiveMinusTwo);
        System.out.println("fourTimeTwo=" + fourTimeTwo);
    }
}
