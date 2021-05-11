public class Gerente extends Funcionario {
    private int numFuncionarios;

    public Gerente(String nome, double salario, int numFuncionarios) {
        super(nome, salario);// super chama o contrutor da superclasse
        this.numFuncionarios = numFuncionarios;
    }

    @Override
    public String exibir() {
        return "Gerente " + super.exibir() + " | " + numFuncionarios;
    }
    @Override
    public String toString() {
        return "Gerente " + super.exibir() + " | " + numFuncionarios;
    }

    @Override
    public void aumentaSalario(double porc) {
        super.aumentaSalario(porc + 10);
    }
}
