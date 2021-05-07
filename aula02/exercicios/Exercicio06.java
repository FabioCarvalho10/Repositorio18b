package exercicios;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double notaA, notaB, media;

        System.out.println("Informe a primeira nota: ");
        notaA = entrada.nextDouble();

        System.out.println("Informe a segunda nota: ");
        notaB = entrada.nextDouble();

        media = (notaA * 0.40) + (notaB * 0.60);

        if (media >= 7.0) {
            System.out.printf("Aluno aprovado com média: %.1f\n", media);
        } else {
            if (media >= 5.0) {
                System.out.printf("Aluno está de exame com média: %.1f\n", media);
            } else {
                System.out.printf("Aluno reprovado com média: %.1f\n", media);
            }
            System.out.println("Programa finalizado.");
            entrada.close();
        }
    }
}
