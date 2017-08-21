package eduardobachiega;

import java.util.Scanner;

/**
 * Created by bachiega on 20/08/17.
 */

public class Exercicio4 {

    public static void main(String[] args) {
        int maisAcidentes = 0, menosAcidentes = 0, totalCarros = 0,
                cdMaisAcidentes = 0, cdMenosAcidentes = 0,
                acMenosDeDoisMil = 0, cidadesMenosDeDoisMil = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Código da cidade: ");
            int cod = sc.nextInt();
            System.out.print("Números de veículos de passeio: ");
            int carros = sc.nextInt();
            System.out.print("Número de acidentes com vítimas: ");
            int acidentes = sc.nextInt();
            if (i == 0) {
                menosAcidentes = acidentes;
                cdMenosAcidentes = cod;
            }
            if (acidentes > maisAcidentes) {
                maisAcidentes = acidentes;
                cdMaisAcidentes = cod;
            }
            if (acidentes < menosAcidentes) {
                menosAcidentes = acidentes;
                cdMenosAcidentes = cod;
            }
            if (carros < 2000){
                acMenosDeDoisMil += acidentes;
                cidadesMenosDeDoisMil++;
            }
            totalCarros += carros;
        }

        System.out.printf("Cidade com mais acidentes: Cidade %d: %d acidentes%n", cdMaisAcidentes, maisAcidentes);
        System.out.printf("Cidade com menos acidentes: Cidade %d: %d acidentes%n", cdMenosAcidentes, menosAcidentes);
        System.out.printf("Média de veículos %d%n", totalCarros/5);
        System.out.printf("Média de acidentes nas cidades com menos de 2000 veículos: %d", acMenosDeDoisMil/cidadesMenosDeDoisMil);
    }
}
