package exercicios;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario;

        System.out.println("Informe o salário: ");
        salario = entrada.nextDouble();

        if (salario <= 600) {
            System.out.println("Isento\n");
        } else {
            if (salario <= 1200) {
                System.out.println("Desconto do INSS será de 20%");
            } else if (salario <= 2000) {
                System.out.println("Desconto do INSS será de 25%");
            } else {
                System.out.println("Desconto do INSS será de 30%");
            }
        }
        System.out.println("Programa finalizado.");
        entrada.close();
    }
}