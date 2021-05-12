import java.util.HashMap;

public class GerenciaContas {
    private HashMap<Integer, Conta> contas;

    public GerenciaContas() {
        contas = new HashMap<>();
    }

    public void novaContaCorrente(int numeroConta) {
        contas.put(numeroConta, new ContaCorrente(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limite) {
        contas.put(numeroConta, new ContaEspecial(numeroConta, limite));
    }

    public void novaContaPoupanca(int numeroConta) {
        contas.put(numeroConta, new ContaPoupança(numeroConta));
    }

    public boolean fazerDeposito(int numeroConta, double valor) {
        Conta objConta = contas.get(numeroConta);

        if (objConta != null) {
            return objConta.deposito(valor);
        }
        return false;// não achou a conta
    }

    public boolean fazerSaque(int numeroConta, double valor) {
        Conta objConta = contas.get(numeroConta);

        if (objConta != null) {
            return objConta.saque(valor);
        }
        return false;// não achou a conta
    }

    public String exibirSaldo(int numeroConta) {
        Conta objConta = contas.get(numeroConta);

        if (objConta != null) {
            return objConta.toString();
        }
        return "Conta não encontrada";
    }
}
