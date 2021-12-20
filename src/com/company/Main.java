package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mass = new int[10];
        int res = 0;
        System.out.println("Введите 10 элементов массива: \n");

        int i;
        for(i = 0; i < 10; ++i) {
            mass[i] = scanner.nextInt();
            res += mass[i];
        }

        System.out.println(res);
        res = 0;
        --i;

        while(i >= 0) {
            res += mass[i];
            --i;
        }

        System.out.println(res);
        res = 0;
        ++i;

        do {
            res += mass[i];
            ++i;
        } while(i < 10);

        System.out.println(res);
    }
}
