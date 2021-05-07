package exercicios;

public class Exercicio08 {
    public static void main(String[] args) {
        int resultado;

        resultado = num(4, 3, 5);

        System.out.printf("O menor número fornececido foi o: %d.", resultado);
    }

    static int num(int n1, int n2, int n3) {
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
