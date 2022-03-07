package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean is_prime = true;
        if (num % 2 == 0) {
            System.out.println("素数でない");
            is_prime = false;
        } else {
            for (int i = 3; i < Math.sqrt(num) + 1; i += 2) {
                if (num % i == 0) {
                    System.out.println("素数でない");
                    is_prime = false;
                    break;
                }
            }
        }
        if (is_prime == true) {
            System.out.println("素数");
        }
    }
}
