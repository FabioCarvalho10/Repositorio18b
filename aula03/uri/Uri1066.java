package uri;
import java.util.Scanner;

public class Uri1066 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, contPar = 0, contImpar = 0, contPositivo = 0, contNegativo = 0;

        for (int i = 0; i < 5; i++) {
            num = entrada.nextInt();
            if (num % 2 == 0) contPar++;
            else contImpar++;
            if (num > 0) contPositivo++;
            else if (num < 0) contNegativo++;
            }
        System.out.println(contPar + " valor(es) par(es)");
        System.out.println(contImpar + " valor(es) impar(es)");
        System.out.println(contPositivo + " valor(es) positivo(s)");
        System.out.println(contNegativo + " valor(es) negativo(s)");

        entrada.close();
    }
}