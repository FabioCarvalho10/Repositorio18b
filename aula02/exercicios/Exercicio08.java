package exercicios;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valorA, valorB, valorC;

        System.out.println("Informe a medida dos  primeira medida: ");
        valorA = entrada.nextDouble();
        valorB = entrada.nextDouble();
        valorC = entrada.nextDouble();

        if (valorA > valorB + valorC && valorB <= valorA + valorB && valorC <= valorB + valorA) {
            System.out.println("Não forma um triângulo.\n");
        } else {
            if (valorA == valorB && valorB == valorC && valorA == valorC) {
                System.out.println("É um triângulo equilátero.\n");
            } else if (valorA == valorB || valorB == valorC || valorA == valorC) {
                System.out.println("É um triângulo isósceles.\n");
            } else {
                System.out.println("É um triângulo escaleno.\n");
            }
        }
        System.out.println("Programa finalizado.");
        entrada.close();
    }
}