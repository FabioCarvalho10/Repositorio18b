package uri;
import java.util.Scanner;

public class Uri1117 {

    public static void main(String[] args) {
        float nota, media = 0, total = 0, total2 = 0;
        Scanner entrada = new Scanner(System.in);

        while (total2 != 2) {
            nota = entrada.nextFloat();
            if (nota >= 0.0 && nota <= 10.0) {
                total += nota;
                total2 += 1;
            } else {
                System.out.println("nota invalida\n");
            }
        }
        media = (float) total / 2;
        System.out.printf("media = %.2f\n", media);

        entrada.close();
    }
}
