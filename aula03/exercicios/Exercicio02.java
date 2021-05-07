package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, soma, cont;

        numero = 1;
        soma = 0;
        cont = 1;

        while (numero != 0) {
            System.out.println("Digite o " + cont + "º número: ");
            numero = entrada.nextInt();
            soma = soma + numero;
            cont++;
        }
        System.out.println("A soma dos valores é: " + soma);
        entrada.close();
    }
}
