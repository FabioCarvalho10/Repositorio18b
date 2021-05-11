public class AppPessoa {
    public static void main(String[] args) {
        //Pessoa p = new Pessoa("Fabio", "11942873003"); // Classe pessoa é Abstract
        //Estudante e = new Estudante("Pedro", "11678593064 ", "Administração");
        //Professor prof = new Professor("Ricardo", "1199642073 ", 4200);

        Pessoa p1 = new Estudante ("Pedro", "11678593064 ", "Administração");
        Pessoa p2 = new Professor ("Ricardo", "1199642073 ", 4200);

        System.out.println(p1.getTipo());
        System.out.println(p1);
        System.out.println(p2.getTipo());
        System.out.println(p2);
    }

}
