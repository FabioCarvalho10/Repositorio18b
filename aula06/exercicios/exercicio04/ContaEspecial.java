public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numConta, double limite) {
        super(numConta);
        this.limite = limite;
    }

    @Override
    public boolean saque(double valor) {
        if (getSaldo() + limite >= valor) {
            return super.saque(valor);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Conta Especial: " + super.toString() + ": " + limite;
    }
}
