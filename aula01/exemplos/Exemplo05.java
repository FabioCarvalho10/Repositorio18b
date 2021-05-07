package exemplos;

public class Exemplo05 {
    public static void main(String[] args) {
        double valor;

        valor = 12.5678;

        System.out.println(valor);

        // System.out.printf (FORMATO, VALORES OU VARIÁVEIS);
        // %d = Número inteiro
        // %f = Número decimal
        // %s = String
        // %.2f = ajustar para 2 casas decimais
        
        System.out.printf("O valor inteiro é %d\n", 13);
        System.out.printf("O valor decimal é %.2f\n", valor);
        System.out.printf("O valor inteiro é %d e o valor decimal é %.2f\n", 13, valor);

        System.out.printf("%3d\n", 1); // %3d alinha o digito em 3 casas da direita p/ esquerda
        System.out.printf("%3d\n", 10);
        System.out.printf("%3d\n", 100);

        System.out.printf("%03d\n", 1);// %30d alinha o digito em 3 casas da direita p/ esquerda e insere o zero
        System.out.printf("%03d\n", 10);
        System.out.printf("%03d\n", 100);
    }
}
