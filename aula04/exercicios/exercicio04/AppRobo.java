package exercicio04;

public class AppRobo {
    public static void main(String[] args) {
        Robo r1 = new Robo (10, 10, 15);

        System.out.println(r1.exibir());
        r1.moverNorte();
        r1.moverSul();
        r1.moverSul();
        r1.moverLeste();
        r1.moverLeste();
        r1.moverOeste();

        System.out.println(r1.exibir());

    }
}
