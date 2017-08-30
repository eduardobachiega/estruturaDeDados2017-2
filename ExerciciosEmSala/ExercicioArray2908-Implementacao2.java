package com.company;

import java.util.Scanner;

public class ExercicioArray2908-Implementacao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome: ");
            nomes[i] = sc.nextLine();
        }
        System.out.println("\nOrdem normal");
        for (String s : nomes) {
            System.out.println(s);
        }

        System.out.println("\n\nOrdem reversa");

        for (int i = nomes.length - 1; i >= 0; i--) {
            System.out.println(nomes[i]);
        }

        System.out.println("\nItem 3: " + nomes[3]);
    }
}
