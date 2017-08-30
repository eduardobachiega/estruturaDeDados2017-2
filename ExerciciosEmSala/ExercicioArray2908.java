package com.company;

import java.util.Scanner;

public class ExercicioArray2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome: ");
            nomes[i] = sc.nextLine();
        }

        for (String s : nomes) {
            System.out.println(s);
        }
    }
}
