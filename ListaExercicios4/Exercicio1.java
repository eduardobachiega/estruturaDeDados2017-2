package eduardobachiega;

/**
 * Created by bachiega on 20/08/17.
 */
public class Exercicio1 {

    public static void main(String[] args) {
        double aumento = 0.015;
        double salario = 1000 + (1000 * aumento);
        for (int i = 2007; i <= 2017; i++) {
            aumento *= 2;
            salario += salario * aumento;
            System.out.println(aumento);
        }
        System.out.printf("Salário atual do funcionário: %f", salario);
    }
}
