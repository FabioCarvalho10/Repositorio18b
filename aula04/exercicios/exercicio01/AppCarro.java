package exercicio01;

public class AppCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro("Chevrolet", "Celta", 9);
        Carro c2 = new Carro("Peugeot", "308", 10);

        //c1.consumo = 11; Classe Objeto está private
        //c2.consumo = 12; Classe Objeto está private

        c1.setConsumo(8.5);
        c2.setConsumo(9.2);

        c1.exibir();
        System.out.println("Consumo: " + c1.getConsumo() + "\n");

        c2.exibir();
        System.out.println("Consumo: " + c2.getConsumo());

    }

}
