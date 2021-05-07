package exercicios;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valorA, valorB;

        System.out.println("Informe o primeiro número: ");
        valorA = entrada.nextDouble();

        System.out.println("Informe o segundo número: ");
        valorB = entrada.nextDouble();

        if (valorA >= valorB) {
            System.out.println(valorA + " ; " + valorB);
           //System.out.printf("%.1f ; %.1f \n", valorA, valorB);
        } else {
            System.out.println(valorB + " ; " + valorA);
            //System.out.printf("%.1f ; %.1f \n", valorB, valorA);
        }
        System.out.println("Programa finalizado.");
        entrada.close();
    }
}