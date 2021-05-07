package exercicios;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double custoFabrica, valorDistribuidor, valorImposto, valorTotal;

        System.out.println("Informe o valor de custo de fábrica do carro: ");
        custoFabrica = entrada.nextDouble();

        valorDistribuidor = custoFabrica * 0.28;
        valorImposto = custoFabrica * 0.45;

        valorTotal = custoFabrica + valorDistribuidor + valorImposto;

        System.out.printf("O custo final a ser pago pelo consumidor será de: R$ %.2f\n", valorTotal);
        System.out.printf("O valor dos impostos será de: R$ %.2f\n", (valorImposto + valorDistribuidor));

        entrada.close();
    }
    
}
