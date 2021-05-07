package exercicios;

public class Exercicio06 {
    public static void main(String[] args) {
        int resultado;

        resultado = par(5);

        if (resultado == 1) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é impar. ");
        }
    }
    static int par(int n1) {
        if (n1 % 2 == 0) {
            return 1;
        } else {
            return 2;
        }
    }
}