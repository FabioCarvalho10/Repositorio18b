package exercicios;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, somaPar = 0;
        final int TOTAL_NUMERO = 10;

        for (int i = 1; i <= TOTAL_NUMERO; i++) {
            System.out.printf("Digite o %dº número: ", i);
            numero = entrada.nextInt();
            if (numero % 2 == 0) {
                somaPar++;
            }
        }
            System.out.println("O total de números pares é: " + somaPar);
            System.out.println("O total de números impares é: " + (TOTAL_NUMERO - somaPar));

            entrada.close();
        }
    }