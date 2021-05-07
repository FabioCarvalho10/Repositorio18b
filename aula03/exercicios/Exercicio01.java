package exercicios;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, cont;

        System.out.println("Informe um número inteiro: ");
        numero = entrada.nextInt();

        cont = 1;

        while (cont <= numero) {
            System.out.print(cont);
            cont *= 2;
            if (cont <= numero) {
                System.out.print(", ");
            }
            entrada.close();
        }
    }
}
