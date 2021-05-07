package uri;
import java.util.Scanner;

public class Uri1003 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valorA, valorB, soma;

        valorA = entrada.nextInt();
        valorB = entrada.nextInt();

        soma = valorA + valorB;

        System.out.println("SOMA = " + soma);

        entrada.close();
    }
}
