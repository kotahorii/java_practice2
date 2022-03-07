package com.company;

public class Main {

    public static void main(String[] args) {
        int fact = 1;
        for (int i = 7; i > 0; i--) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
