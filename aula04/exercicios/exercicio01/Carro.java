package exercicio01;

public class Carro {
    String marca, modelo;
    private double consumo;

    public Carro(String marca, String modelo, double consumo) { // MÉTODO CONSTRUTOR = INICIALIZADOR DOS OBJETOS
        this.marca = marca;
        this.modelo = modelo;
        setConsumo(consumo);
    }

    public void exibir() {
        System.out.println("Marca: " + marca + "\nModelo: " + modelo);
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double novoConsumo) {
        if (novoConsumo > 0 && novoConsumo < 50) {
            consumo = novoConsumo;
        }
    }
}