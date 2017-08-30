package com.company;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero de termos: ");
        int termos = sc.nextInt();
        int primeiro = 2, posicaoPrimeiro = 1, segundo = 7, posicasoSegundo = 2, terceiro = 3, posicaoTerceiro = 3;
        for (int i = 1; i <= termos; i++) {
            if (posicaoPrimeiro == i) {
                System.out.println(primeiro);
                primeiro = primeiro * 2;
                posicaoPrimeiro = posicaoPrimeiro + 3;
            } else if (posicasoSegundo == i) {
                System.out.println(segundo);
                segundo = segundo * 3;
                posicasoSegundo = posicasoSegundo + 3;
            } else {
                System.out.println(terceiro);
                terceiro = terceiro * 4;
                posicaoTerceiro = posicaoTerceiro + 3;
            }
        }

    }
}