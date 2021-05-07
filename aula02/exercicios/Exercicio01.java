package exercicios;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor;

        System.out.println("Informe um valor inteiro: ");
        valor = entrada.nextInt();

        if (valor > 20) {
            System.out.println(valor / 2.0);
        }

        System.out.println("Final do programa.");
        entrada.close();
    }
}