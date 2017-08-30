package eduardobachiega;

import java.util.Scanner;

/**
 * Created by bachiega on 20/08/17.
 */

public class Exercicio3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de números a serem lidos: ");
        int qtd = sc.nextInt();
        for (int i = 0; i < qtd; i++){
            System.out.print("Digite um número: ");
            int n = sc.nextInt();
            int fat = 1;
            for (int j = 2; j <= n; j++){
                fat *= j;
            }
            System.out.printf("%d! = %d%n", n, fat);
        }
    }
}
