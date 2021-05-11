
public class Animal {

    private String nome;
    private String raca;
    private int anoNascimento;
    private Proprietario proprietario;

    public Animal() {
        proprietario = new Proprietario();
    }

    public void exibir() {
        System.out.println(nome + ", " + raca + ", " + anoNascimento);
        proprietario.exibir();
    }
}