public abstract class Pessoa { // Abstract é um modelo e não permite instanciar objetos
    private String nome, telefone;

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return nome + ", " + telefone;
    }
    public abstract String getTipo();//Método abstract é obrigatório
    }
