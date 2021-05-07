import java.util.ArrayList;

public class Exemplo02 {
    
    public static void main(String[] args) {
        ArrayList<Pessoa> lista = new ArrayList<>();

        lista.add(new Pessoa ("Fabio", 29));

        lista.add(new Pessoa ("Rogério", 32));

        lista.add(new Pessoa ("Pedro", 54));

        for (Pessoa pessoa : lista) {//foreach
            pessoa.apresentar();
            
        }

    }
}
