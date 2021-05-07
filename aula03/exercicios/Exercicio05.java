package exercicios;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double mediaAluno, mediaTurma, mediaGeral;
        final int TOTAL_ALUNOS = 5;
        final int TOTAL_TURMAS = 10;

        mediaGeral = 0;

        for (int turma = 1; turma <= TOTAL_TURMAS; turma++) {
            System.out.println("\nTurma " + turma);
            mediaTurma = 0;
            for (int aluno = 1; aluno <= TOTAL_ALUNOS; aluno++) {
                System.out.printf("Digite a média do " + aluno + "º aluno: ");
                mediaAluno = entrada.nextDouble();
                mediaTurma = mediaTurma + mediaAluno;
            }
            mediaTurma = mediaTurma / TOTAL_ALUNOS;
            mediaGeral = mediaGeral + mediaTurma;
            System.out.println("A média de notas da turma " + turma + " é: " + mediaTurma);
        }
        mediaGeral = mediaGeral / TOTAL_TURMAS;
        System.out.println("A Média geral da turma é: " + mediaGeral);
        entrada.close();
    }
}