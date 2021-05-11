
public class Pessoa {

    private String nome;
    private Endereco endereco;
    private int idade;

    public Pessoa() {
        endereco = new Endereco();
    }

    public void exibir() {
        System.out.println(nome + ", " + idade);
        endereco.exibir();
    }
}
