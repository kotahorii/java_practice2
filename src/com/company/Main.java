package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int print_count = scanner.nextInt();
        String output_chars = "";

        for (int i = 0; i < print_count; i++) {
            output_chars += i % 10;
        }
        System.out.println(output_chars);
    }
}
