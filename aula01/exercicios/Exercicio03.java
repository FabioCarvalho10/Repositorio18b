package exercicios;
import java.util.Scanner;

public class Exercicio03 {
 
        public static void main(String[] args) {
            Scanner entrada = new Scanner (System.in);
            String nome;
            double salario, novoSalario;
    
            System.out.println("Digite o nome do funcionário: ");
            nome = entrada.nextLine();
            System.out.println("Informe o salário do funcionário: ");
            salario = entrada.nextDouble();

            novoSalario = salario * 1.25;

            System.out.println("O novo salário do funcionário " + nome + " é: " + novoSalario);
    
            entrada.close();
        }
        
    } 
