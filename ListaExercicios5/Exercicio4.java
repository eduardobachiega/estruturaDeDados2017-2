package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int[] numeros = new int[8];
        int[] positivos = new int[8];
        int[] negativos = new int[8];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite um numero[%d]: ", i);
            numeros[i] = sc.nextInt();
        }

        int posicaoPos = 0;
        int posicaoNeg = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                positivos[posicaoPos] = numeros[i];
                posicaoPos++;
            } else {
                negativos[posicaoNeg] = numeros[i];
                posicaoNeg++;
            }
        }


        System.out.printf("Positivos: %s%n", Arrays.toString(positivos));
        System.out.printf("Negativos: %s", Arrays.toString(negativos));
    }
}