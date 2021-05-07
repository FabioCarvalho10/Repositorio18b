package exercicios;
import java.util.Scanner;
   
public class Exercicio04 {
 
        public static void main(String[] args) {
            Scanner entrada = new Scanner (System.in);
            double salarioMinimo, KwConsumido, valorKw, valorTotal, desconto;
    
            System.out.println("Informe o valor do salário mínimo: ");
            salarioMinimo = entrada.nextDouble();

            System.out.println("Informe o consumo de quilowatt da resiência: ");
            KwConsumido = entrada.nextDouble();

            valorKw = salarioMinimo / 500;
            valorTotal = valorKw * KwConsumido;
            desconto = valorTotal - (valorTotal * 15) / 100;

            System.out.println("O valor em reais de cada quilowatt será de: " + valorKw);
            System.out.println("O valor em reais a ser pago por essa residência será de: " + valorTotal);
            System.out.println("O valor em reais a ser pago com desconto de 15% será de: " + desconto);
    
            entrada.close();
        }
        
    } 
