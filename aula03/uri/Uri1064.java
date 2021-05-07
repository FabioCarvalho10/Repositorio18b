package uri;
import java.util.Scanner;

public class Uri1064 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont = 0;
        double media = 0;
        double num;

        for (int i = 0; i < 6; i++) {
            num = entrada.nextDouble();
            if (num > 0) {
                cont++;
                media += num;
            }
        }
        media = media / cont;
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));

        entrada.close();
    }
}