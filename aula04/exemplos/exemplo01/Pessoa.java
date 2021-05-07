//package exemplo01;

// MODELO
public class Pessoa {
    // atributos = características
    String nome;
    int idade;

    // MÉTODO CONSTRUTOR = INICIALIZADOR DOS OBJETOS
    Pessoa(String nome, int idade) {
       this.nome = nome; // this. = PRÓPRIO OBJETO
       this.idade = idade;

    }

    // MÉTODOS = AÇÕES (VERBO)
    void apresentar() {
        System.out.println("Olá! Eu sou " + nome + " e tenho " + idade + " anos.");
    }

}
