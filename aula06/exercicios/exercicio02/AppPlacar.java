public class AppPlacar {
    public static void main(String[] args) {

        Placar p1 = new Placar();
        Placar p2 = new Placar("Corinthians", "Palmeiras");
        Placar p3 = new Placar("Corinthians", "Palmeiras", 3, 0);

        System.out.println(p1.exibirPlacar());
        System.out.println(p2.exibirPlacar());
        System.out.println(p3.exibirPlacar());
    }
}
