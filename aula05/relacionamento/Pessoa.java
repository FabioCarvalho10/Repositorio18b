package relacionamento;

public class Pessoa {

        private String nome;
        private Endereco endereco;
        private int idade;

        public void exibir(){
            System.out.println(nome + ", " + idade);
            endereco.exibir();
        }
    }
