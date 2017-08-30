package com.company;

import java.util.Scanner;

public class ExerciciosSomaItensArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inteiros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um numero: ");
            inteiros[i] = sc.nextInt();
        }
        int total = 0;
        for (int i : inteiros) {
            total += i;
        }

        System.out.println(total);
    }
}
