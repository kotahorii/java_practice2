package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 1; i < num + 1; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.printf("$");
            }
            System.out.println();
        }
    }
}
