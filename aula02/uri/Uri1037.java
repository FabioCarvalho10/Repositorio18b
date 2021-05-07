package uri;
import java.util.Scanner;

public class Uri1037 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float valorA;

        valorA = entrada.nextFloat();

        if (valorA >= 0 && valorA <= 25.0000) {
            System.out.println("Intervalo [0,25]");
        } else if (valorA > 25.0001 && valorA <= 50.0000000) {
            System.out.println("Intervalo (25,50]");
        } else if (valorA > 50.0001 && valorA <= 75.0000000) {
            System.out.println("Intervalo (50,75]");
        } else if (valorA > 75.0001 && valorA <= 100.0000000) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
        entrada.close();
    }
}
