package exercicio02;

public class Relogio {
    private int hora, minuto, segundo;

    public Relogio(int hora, int minuto, int segundo) { // MÉTODO CONSTRUTOR = INICIALIZADOR DOS OBJETOS
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public void exibir() {
        System.out.printf("%02d : %02d : %02d\n", hora, minuto, segundo);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int novaHora) {
        if (novaHora >= 0 && novaHora <= 23) {
            hora = novaHora;
        }
    }

    public void setMinuto(int novoMinuto) {
        if (novoMinuto >= 0 && novoMinuto <= 59) {
            minuto = novoMinuto;
        }
    }

    public void setSegundo(int novoSegundo) {
        if (novoSegundo >= 0 && novoSegundo <= 59) {
            segundo = novoSegundo;

        }
    }
}
