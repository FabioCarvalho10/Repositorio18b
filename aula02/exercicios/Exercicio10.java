package exercicios;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, multiplicador;

        System.out.println("Informe um número inteiro: ");
        numero = entrada.nextInt();

        multiplicador = 0;

        while (multiplicador <= 10) {
            System.out.printf("%d x %02d = %02d\n", numero, multiplicador, numero * multiplicador);
            multiplicador++;

            entrada.close();
        }
    }
}
