package com.company;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inteiros = new int[5];
        for (int i = 0; i < inteiros.length; i++) {
            System.out.print("Digite um numero: ");
            inteiros[i] = sc.nextInt();
        }
        int total = 0;
        int maior = 0;
        int menor = inteiros[0];
        for (int i : inteiros) {
            total += i;
            if (i > maior)
                maior = i;
            if (i < menor)
                menor = i;
        }

        System.out.println("Soma: " + total);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}