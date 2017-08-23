package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int salarioMinimo = 450;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Codigo do funcionario: ");
            int cod = sc.nextInt();
            System.out.print("Numero de horas trabalhadas: ");
            double horasTrabalhadas = sc.nextDouble();
            String turno;
            do {
                System.out.print("Turno: ");
                turno = sc.next().toUpperCase();
            } while (!turno.equals("M") && !turno.equals("N") && !turno.equals("V"));
            String categoria;
            do {
                System.out.print("Categoria: ");
                categoria = sc.next().toUpperCase();
            } while (!categoria.equals("G") && !categoria.equals("O"));

            double valorHoraTrabalhada;
            if (categoria.equals("G")) {
                if (turno.equals("N")) {
                    valorHoraTrabalhada = salarioMinimo * 0.18;
                } else {
                    valorHoraTrabalhada = salarioMinimo * 0.15;
                }
            } else {
                if (turno.equals("N")) {
                    valorHoraTrabalhada = salarioMinimo * 0.13;
                } else {
                    valorHoraTrabalhada = salarioMinimo * 0.10;
                }
            }

            double salarioInicial = horasTrabalhadas * valorHoraTrabalhada;

            double auxilioAlimentacao;
            if (salarioInicial < 300){
                auxilioAlimentacao = salarioInicial * 0.2;
            } else if (salarioInicial < 600){
                auxilioAlimentacao = salarioInicial * 0.1;
            } else {
                auxilioAlimentacao = salarioInicial * 0.05;
            }

            double salarioFinal = salarioInicial + auxilioAlimentacao;

            System.out.printf("%nCodigo: %d%nHoras trabalhadas: %f%n" +
                    "Salario inicial: %f%nAuxilio alimentacao: %f%n" +
                    "Salario final: %f%n%n", cod, horasTrabalhadas,
                    salarioInicial, auxilioAlimentacao, salarioFinal);
        }
    }
}
