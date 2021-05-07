package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, somaPar = 0, somaImpar = 0;
        float media = 0;
        final int TOTAL_NUMERO = 10;

        for (int i = 1; i <= TOTAL_NUMERO; i++) {
            System.out.printf("Digite o %dº número inteiro: ", i);
            numero = entrada.nextInt();
            if (numero % 2 == 0) {
                media += numero;
                somaPar++;
            } else {
                somaImpar++;
            }
        }
        System.out.println("A média dos valores pares é: " + media / somaPar);
        System.out.println("A porcentagem de número ímpares entre todos os números digitados é: " + somaImpar * 100 / 10 + " %");

        entrada.close();
    }
}
