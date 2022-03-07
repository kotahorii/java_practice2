package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean is_stop = false;
        int sum = 0;
        while (!is_stop) {
            int num = scanner.nextInt();
            if (num == 0) {
                is_stop = true;
            } else {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
