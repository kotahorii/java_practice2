package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int max_num = 0;
        int min_num = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int input_num = scanner.nextInt();
            if (max_num == 0) {
                max_num = input_num;
            } else {
                if (input_num > max_num) {
                    max_num = input_num;
                }
            }

            if (min_num == 0) {
                min_num = input_num;
            } else {
                if (input_num < min_num) {
                    min_num = input_num;
                }
            }
        }
        System.out.println(max_num);
        System.out.println(min_num);
    }
}
