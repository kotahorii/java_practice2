package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int strike_count = 0;
        int ball_count = 0;
        Scanner scanner = new Scanner(System.in);

        while (strike_count < 3 && ball_count < 4) {
            int num = scanner.nextInt();

            if (num == 1) {
                strike_count += 1;
            } else if (num == 2) {
                ball_count += 1;
            } else if (num == 3 && strike_count < 2) {
                strike_count += 1;
            }
        }
        System.out.println(ball_count + "ボール、" + strike_count + "ストライク");
    }
}
