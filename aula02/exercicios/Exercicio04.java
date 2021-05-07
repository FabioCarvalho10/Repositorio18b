package exercicios;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salarioBruto, valorPrestacao, calculo;

        System.out.println("Informe o salário bruto: ");
        salarioBruto = teclado.nextDouble();

        System.out.println("Informe o valor da prestação: ");
        valorPrestacao = teclado.nextDouble();

        calculo = salarioBruto * 0.30;

        if (valorPrestacao <= calculo) {
            System.out.println("O empréstimo poderá ser concedido! Valor da prestação não atingiu 30% do salário bruto.");
        } else {
            System.out.println("O empréstimo não poderá ser concedido! Valor da prestação atingiu 30% do salário bruto.");
        }
        System.out.println("Programa finalizado.");
        teclado.close();
    }
}