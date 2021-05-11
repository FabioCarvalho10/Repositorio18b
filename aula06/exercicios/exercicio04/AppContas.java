import java.util.ArrayList;
import java.util.Scanner;

public class AppContas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao, numeroConta;
        double limite, valor;
        ArrayList<Conta> contas = new ArrayList<>();

        ContaCorrente cc = null;
        ContaPoupança cp = null;
        ContaEspecial ce = null;

        do {
            System.out.println("1- Nova Conta Corrente");
            System.out.println("2- Nova Conta Especial");
            System.out.println("3- Nova Conta Poupança");
            System.out.println("4- Realizar Depósito");
            System.out.println("5- Realizar Saque");
            System.out.println("6- Exibir Saldo");
            System.out.println("7- Sair");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o número da conta: ");
                    numeroConta = entrada.nextInt();
                    cc = new ContaCorrente(numeroConta);
                    contas.add(cc);
                    break;

                case 2:
                    System.out.println("Informe o número da conta: ");
                    numeroConta = entrada.nextInt();
                    System.out.println("Informe o limite: ");
                    limite = entrada.nextDouble();
                    ce = new ContaEspecial(numeroConta, limite);
                    contas.add(ce);
                    break;

                case 3:
                    System.out.println("Informe o número da conta: ");
                    numeroConta = entrada.nextInt();
                    cp = new ContaPoupança(numeroConta);
                    contas.add(cp);
                    break;

                case 4:
                    System.out.println("Informe o número da conta: ");
                    numeroConta = entrada.nextInt();
                    System.out.println("Informe o valor: ");
                    valor = entrada.nextDouble();

                    for (Conta objConta : contas) {
                        if (objConta.getNumConta() == numeroConta) {
                            if (objConta.deposito(valor)) {
                                System.out.println("Depósito Realizado com Sucesso");
                            } else {
                                System.out.println("Falha na Operação");
                            }
                        }
                    }
                    break;

                case 5:
                    System.out.println("Informe o número da conta: ");
                    numeroConta = entrada.nextInt();
                    System.out.println("Informe o valor: ");
                    valor = entrada.nextDouble();

                    for (Conta objConta : contas) {
                        if (objConta.getNumConta() == numeroConta) {
                            if (objConta.saque(valor)) {
                                System.out.println("Saque Realizado com Sucesso");
                            } else {
                                System.out.println("Falha na Operação");
                            }
                        }
                    }
                    break;

                case 6:
                    System.out.println("Informe o número da conta: ");
                    numeroConta = entrada.nextInt();

                    for (Conta objConta : contas) {
                        if (objConta.getNumConta() == numeroConta) {
                            System.out.println(objConta);
                        }
                    }
                    break;

                case 7:
                    break;

                default:
                    System.out.println("\nOpção inválida!\n");
                    break;
            }

        } while (opcao != 7);
        entrada.close();
    }

    // Conta c = new Conta(76972);
    // ContaCorrente c = new ContaCorrente(76972);
    // ContaEspecial c = new ContaEspecial(12345, 100);
    /*
     * ContaPoupança c = new ContaPoupança(98764);
     * 
     * ContaPoupança.setTaxaOperacao(0.1);
     * 
     * if (c.deposito(100)) { System.out.println("Depósito Realizado"); } else {
     * System.out.println("Falha na operação"); } System.out.println(c);
     * 
     * if (c.saque(50)) { System.out.println("Saque Realizado"); } else {
     * System.out.println("Falha na operação"); } System.out.println(c);
     * 
     * }
     */
}