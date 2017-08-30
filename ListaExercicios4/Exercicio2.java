package eduardobachiega;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by bachiega on 20/08/17.
 */

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        double r = 0, fat;
        for (int i = 1; i <= n; i++) {
            fat = 1;
            for (int j = 1; j < i; j++) {
                fat = fat * j;
            }
            r = r + 1 / fat;
        }
        System.out.print(r);
    }
}
