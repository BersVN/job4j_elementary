package ru.job4j.io;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int columnCount = in.nextInt();
        String star = "*";
        String space = " ";
        String[] str;
        int rowCount = (int) columnCount / 2;

        str = new String[columnCount];
        for (int i = 0; i < columnCount; i++) {
            for (int j = -rowCount; j < rowCount; j++) {
                if (i == 0 || i == columnCount)  {
                    str[i] =  str[i] + star;
                } else {
                    if (Math.abs(j) == i) {
                        str[i] = str[i] + star;
                    } else {
                        str[i] = str[i] + space;
                    }
                }
            }
            System.out.println(str[i]);
        }

    }
}