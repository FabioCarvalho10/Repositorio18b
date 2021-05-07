package exercicio02;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio r = new Relogio (12, 15, 03);

        r.setHora(23);
        r.setMinuto(59);
        r.setSegundo(59);

        r.exibir();
        System.out.println("Hora:" + r.getHora());
    }
}
