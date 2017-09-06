package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int x = 0, j = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array1.length; i++) {
            System.out.printf("Array 1 [%d]: ");
            array1[i] = sc.nextInt();
            System.out.printf("Array 2 [%d]: ");
            array2[i] = sc.nextInt();
        }

        int tamanho = array1.length + array2.length;
        int[] novoArray = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            if (i % 2 != 0) {
                novoArray[i] = array2[x];
                x++;
            } else {
                novoArray[i] = array1[j];
                j++;
            }
        }

        System.out.print(Arrays.toString(novoArray));
    }
}