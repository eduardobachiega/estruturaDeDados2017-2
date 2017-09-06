package com.company;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        double[] valorUnitario = new double[10];
        int[] quantidade = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < valorUnitario.length; i++) {
            System.out.print("Valor do produto: ");
            valorUnitario[i] = sc.nextDouble();
            System.out.print("Quantidade: ");
            quantidade[i] = sc.nextInt();
        }

        double totalVendas = 0;
        int posicaoMaisVendido = 0;
        double maiorQtd = 0;
        for (int i = 0; i < valorUnitario.length; i++) {
            if (quantidade[i] > maiorQtd) {
                maiorQtd = quantidade[i];
                posicaoMaisVendido = i;
            }
            double totalProduto = valorUnitario[i] * quantidade[i];
            totalVendas += totalProduto;
            System.out.printf("Qtd: %d | Valor unit: %f | Total: %f%n", quantidade[i], valorUnitario[i], totalProduto);
        }

        double comissaoVendedor = totalVendas * 0.05;
        System.out.printf("Valor total das vendas: %f%n", totalVendas);
        System.out.printf("Comissao do vendedor: %f%n", comissaoVendedor);
        System.out.printf("Valor objeto mais vendido, posicao %d no vetor: %f (Total: %f)%n", posicaoMaisVendido,
                valorUnitario[posicaoMaisVendido],
                valorUnitario[posicaoMaisVendido] * quantidade[posicaoMaisVendido]);
    }
}