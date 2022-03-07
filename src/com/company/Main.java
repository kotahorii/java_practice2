package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kyojin_sum = 0;
        int hanshin_sum = 0;
        String winner;
        for (int i = 1; i < 10; i++) {
            int kyojin_point = scan.nextInt();
            int hanshin_point = scan.nextInt();

            kyojin_sum += kyojin_point;
            hanshin_sum += hanshin_point;
        }
        if (kyojin_sum > hanshin_sum) {
            winner = "巨人";
        } else {
            winner = "阪神";
        }
        System.out.println("巨人：" + kyojin_sum + "点" + "阪神：" + hanshin_sum + "点");
        System.out.println(winner + "の勝ち");
    }
}
