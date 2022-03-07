package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean is_stop = false;
        int sum = 0;
        int count = 0;
        while (!is_stop) {
            int num = scanner.nextInt();
            if (num == 0 && count != 0) {
                is_stop = true;
            } else {
                sum += num;
                count += 1;
            }
        }
        System.out.println((double) sum / count);
    }
}
