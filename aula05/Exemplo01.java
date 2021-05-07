import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;

        while (numero == 0) {
            try {
                System.out.println("Digite um número: ");
                // numero = entrada.nextInt();
                numero = Integer.parseInt(entrada.nextLine());
                System.out.println("Você digitou: " + numero);
            } catch (InputMismatchException ex) {
                System.out.println("Valor digitado é inválido!");
                // entrada.nextInt();
            } catch (NumberFormatException ex) {
                System.out.println("Valor digitado é inválido!");
                System.out.println("Erro: " + ex.getMessage());
                ex.printStackTrace();
            } catch (Exception ex) {
                System.out.println("Erro: " + ex.getMessage());
            } finally {
                System.out.println("\nObrigado!");
            }
        }
        System.out.println("\nFinal do programa");

        entrada.close();
    }
}
