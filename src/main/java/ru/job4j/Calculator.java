package ru.job4j;

public class Calculator {
    public static int func1(int x) {
        return x * x + 1;
    }

    public static void main(String[] args) {
        int result3 = Calculator.func1(100);
        System.out.println("result3 = " + result3);
    }
}