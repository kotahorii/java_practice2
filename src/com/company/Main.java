package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || (size - i - 1) == j) {
                    System.out.printf("X");
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
    }
}
