package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        Scanner scan = new Scanner(System.in);
        int zero_count = 0;
        int one_count = 0;
        while (count < 10) {
            int num = scan.nextInt();
            if (num == 0) {
                zero_count += 1;
                count += 1;
            } else if (num == 1) {
                one_count += 1;
                count += 1;
            }
        }
        System.out.println("勝ち" + one_count + "回 " + "負け" + zero_count + "回");
    }
}
