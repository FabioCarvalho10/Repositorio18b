public class Conta {
    private int numConta;
    private double saldo;

    public Conta(int numConta) {
        this.numConta = numConta;
        saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }
    public double getNumConta() {
        return numConta;
    }

    public boolean deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

    public boolean saque(double valor) {
        if (valor > 0) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return numConta + " | " + saldo;
    }

}