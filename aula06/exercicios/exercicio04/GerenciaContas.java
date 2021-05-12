import java.util.ArrayList;

public class GerenciaContas {
    private ArrayList<Conta> contas = new ArrayList<>();

    public GerenciaContas() {
        contas = new ArrayList<>();
    }

    public void novaContaCorrente(int numeroConta) {
        // ContaCorrente cc = null;
        // cc = new ContaCorrente(numeroConta);
        // contas.add(cc);
        contas.add(new ContaCorrente(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limite) {
        // ContaCorrente ce = null;
        // ce = new ContaCorrente(numeroConta, limite);
        // contas.add(ce);
        contas.add(new ContaEspecial(numeroConta, limite));
    }

    public void novaContaPoupanca(int numeroConta) {
        // ContaCorrente cp = null;
        // cp = new ContaCorrente(numeroConta, limite);
        // contas.add(cp);
        contas.add(new ContaPoupança(numeroConta));
    }

    public boolean fazerDeposito(int numeroConta, double valor) {
        for (Conta objConta : contas) {
            if (objConta.getNumConta() == numeroConta) {
                if (objConta.deposito(valor)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public boolean fazerSaque(int numeroConta, double valor) {
        for (Conta objConta : contas) {
            if (objConta.getNumConta() == numeroConta) {
                if (objConta.saque(valor)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public String exibirSaldo(int numeroConta) {
        for (Conta objConta : contas) {
            if (objConta.getNumConta() == numeroConta) {
                return "Conta: " + objConta;
            }
        }
        return "Conta não encontrada";
    }
}
