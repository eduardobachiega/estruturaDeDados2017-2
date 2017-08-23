package com.company;

public class Exercicio7 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < 4; i++) {
            System.out.println(a);
            a += b;
            System.out.println(b);
            b += a;
        }
    }
}