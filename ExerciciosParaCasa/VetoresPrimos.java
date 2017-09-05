package exercicios;

import java.util.Scanner;

public class VetoresPrimos {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numeros[] = new int[9];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("[%d]: ", i);
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            int n = numeros[i];
            int count = 0;
            for (int j = 1; j <= n; j++) {
                if (n % j == 0)
                    count++;
            }
            if (count == 2)
                System.out.printf("Numero %d na posição %d é primo%n", n, i);
        }
    }
}
