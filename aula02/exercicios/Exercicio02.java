package exercicios;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double notaA, notaB, media;

        System.out.println("Informe a primeira nota: ");
        notaA = entrada.nextDouble();

        System.out.println("Informe a segunda nota: ");
        notaB = entrada.nextDouble();

        media = (notaA * 0.40) + (notaB * 0.60);

        if (media >= 6.0) {
            System.out.println("Aluno aprovado com média: " + media);
        } else {
            System.out.println("Aluno reprovado com média: " + media);
        }
        System.out.println("Programa finalizado.");
        entrada.close();
    }
}
