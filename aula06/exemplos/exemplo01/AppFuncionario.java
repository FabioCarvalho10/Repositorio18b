public class AppFuncionario {

    public static void main(String[] args) {
        Funcionario f = new Funcionario("Bruna", 4000);
        Gerente g = new Gerente("Pedro", 4000, 10);

        f.aumentaSalario(10);
        g.aumentaSalario(10);
        System.out.println(f.exibir());
        System.out.println(g.exibir());

        System.out.println("----------------------");
        System.out.println(f.toString());
        System.out.println(g);

    }
}
