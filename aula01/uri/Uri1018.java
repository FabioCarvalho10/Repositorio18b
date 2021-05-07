package uri;
import java.util.Scanner;

public class Uri1018 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valorA;

        valorA = entrada.nextInt();
        System.out.println(valorA);

        System.out.printf(valorA / 100 + " nota(s) de R$ 100,00\n");
        valorA = valorA % 100;
        System.out.printf(valorA / 50 + " nota(s) de R$ 50,00\n");
        valorA = valorA % 50;
        System.out.printf(valorA / 20 + " nota(s) de R$ 20,00\n");
        valorA = valorA % 20;
        System.out.printf(valorA / 10 + " nota(s) de R$ 10,00\n");
        valorA = valorA % 10;
        System.out.printf(valorA / 5 + " nota(s) de R$ 5,00\n");
        valorA = valorA % 5;
        System.out.printf(valorA / 2 + " nota(s) de R$ 2,00\n");
        valorA = valorA % 2;
        System.out.printf(valorA / 1 + " nota(s) de R$ 1,00\n");
        valorA = valorA % 1;

        entrada.close();
    }
}
