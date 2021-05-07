package uri;
import java.util.Scanner;

public class Uri1051 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float salario;

        salario = entrada.nextFloat();

        if (salario >= 0 && salario <= 2000.00) {
            System.out.printf("Isento\n");
        } else if (salario > 2000.01 && salario <= 3000.00) {
            System.out.printf("R$ %.2f\n", (salario - 2000) * 0.08);
        } else if (salario > 3000.01 && salario <= 4500.00) {
            System.out.printf("R$ %.2f\n", ((salario - 3000) * 0.18) + 80);
        } else {
            System.out.printf("R$ %.2f\n", ((salario - 4500) * 0.28) + 350);
        }
        entrada.close();
    }
}
