package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h, i;
        h = p / (2 * (k + 1));
        i = h * k;
        return i * h;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 1, s = 2, real = " + String.format("%.1f", result1));
    }
}
