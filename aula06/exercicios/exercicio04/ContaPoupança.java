
public class ContaPoupança extends Conta {
    private static double taxaOperacao;// Atributo de classe

    public ContaPoupança(int numConta) {
        super(numConta);
    }

    public static void setTaxaOperacao(double taxaOperacao) {
        if (taxaOperacao > 0) {
            ContaPoupança.taxaOperacao = taxaOperacao;
        }
    }

    @Override
    public boolean saque(double valor) {
        if (getSaldo() >= valor + taxaOperacao) {
            return super.saque(valor + taxaOperacao);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Conta Poupança: " + super.toString() + " - " + taxaOperacao;
    }
}
