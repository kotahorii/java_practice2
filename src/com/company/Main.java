package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;

        for (int i = 1; i < n + 1; i++) {
            if (i == 1) {
                System.out.println(a);
            } else if (i == 2) {
                System.out.println(b);
            } else {
                int tmp = a;
                a = b;
                b += tmp;
                System.out.println(b);
            }
        }
    }
}
