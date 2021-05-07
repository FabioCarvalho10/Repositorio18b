package uri;
import java.util.Scanner;

public class Uri1004 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valorA, valorB, produto;

        valorA = entrada.nextInt();
        valorB = entrada.nextInt();

        produto = valorA * valorB;

        System.out.println("PROD = " + produto);

        entrada.close();
    }
}
