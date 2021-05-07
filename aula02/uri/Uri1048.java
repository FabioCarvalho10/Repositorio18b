package uri;
import java.util.Scanner;

public class Uri1048 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float salario;

        salario = entrada.nextFloat();

        if (salario >= 0 && salario <= 400.00) {
            System.out.printf("Novo salario: %.2f\n", salario * 1.15);
            System.out.printf("Reajuste ganho: %.2f\n", salario * 0.15);
            System.out.println("Em percentual: 15 %");
        } else if (salario > 400.01 && salario <= 800.00) {
            System.out.printf("Novo salario: %.2f\n", salario * 1.12);
            System.out.printf("Reajuste ganho: %.2f\n", salario * 0.12);
            System.out.println("Em percentual: 12 %");
        } else if (salario > 800.01 && salario <= 1200.00) {
            System.out.printf("Novo salario: %.2f\n", salario * 1.10);
            System.out.printf("Reajuste ganho: %.2f\n", salario * 0.10);
            System.out.println("Em percentual: 10 %");
        } else if (salario > 1200.01 && salario <= 2000.00) {
            System.out.printf("Novo salario: %.2f\n", salario * 1.07);
            System.out.printf("Reajuste ganho: %.2f\n", salario * 0.07);
            System.out.println("Em percentual: 7 %");
        } else {
            System.out.printf("Novo salario: %.2f\n", salario * 1.04);
            System.out.printf("Reajuste ganho: %.2f\n", salario * 0.04);
            System.out.println("Em percentual: 4 %");
        }
        entrada.close();
    }
}
