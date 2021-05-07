package exercicios;
import java.util.Scanner;

public class Exercicio02 {

        public static void main(String[] args) {
            Scanner entrada = new Scanner (System.in);
            String nome;
            double nota1, nota2, media;
    
            System.out.println("Digite seu nome: ");
            nome = entrada.nextLine();
            System.out.println("Digite a primeira nota: ");
            nota1 = entrada.nextDouble();
            System.out.println("Digite a segunda nota: ");
            nota2 = entrada.nextDouble();

            media = (nota1 + nota2) / 2;

            System.out.println("A média aritmética do aluno " + nome + " é: " + media);
    
    
            entrada.close();
        }
        
    } 
