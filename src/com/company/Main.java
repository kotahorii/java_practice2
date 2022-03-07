package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (sum < 100) {
            int num = scanner.nextInt();
            sum += num;
        }
        System.out.println(sum);
    }
}
