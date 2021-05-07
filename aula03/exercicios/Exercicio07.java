package exercicios;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2, n3, menor;

        System.out.println(("Informe 3 número inteiro: "));
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        n3 = entrada.nextInt();

        menor = encontraMenor (n1, n2, n3);

        System.out.printf("O menor número fornececido foi o: %d.", menor);

        entrada.close();
    }

    static int encontraMenor(int n1, int n2, int n3) {
        if (n1 <= n2 && n1 <= n3) {
            return (n1);
        } else {
            if (n2 <= n3 && n2 <= n1) {
                return (n2);
            } else {
                return (n3);
            }
        }
    }
}