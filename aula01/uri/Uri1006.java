package uri;
import java.util.Scanner;

public class Uri1006 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valorA, valorB, valorC, media;

        valorA = entrada.nextDouble();
        valorB = entrada.nextDouble();
        valorC = entrada.nextDouble();

        valorA = valorA * 0.2;
        valorB = valorB * 0.3;
        valorC = valorC * 0.5;
    
        media = (valorA + valorB + valorC);

        System.out.printf("MEDIA = %.1f\n", media);

        entrada.close();
    }
}