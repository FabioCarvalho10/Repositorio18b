package uri;
import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int /*codigo1,*/ qtdePeca1, /*codigo2,*/ qtdePeca2;
        double valorPeca1, valorPeca2, valorTotal;

        //codigo1 = entrada.nextInt();
        qtdePeca1 = entrada.nextInt();
        valorPeca1 = entrada.nextDouble();

        //codigo2 = entrada.nextInt();
        qtdePeca2 = entrada.nextInt();
        valorPeca2 = entrada.nextDouble();
    
        valorTotal = (valorPeca1 * qtdePeca1) + (valorPeca2 * qtdePeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);

        entrada.close();
    }
}
