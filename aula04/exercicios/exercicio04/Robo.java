package exercicio04;

public class Robo {
    private int x, y; // Atributos/Características
    private final int MAX;
    private final int MAX_PLANO = 100;
    private final int MAX_PADRAO = 10;

    public Robo(int x, int y, int MAX) {
        if (MAX > 0 && MAX < MAX_PLANO) {
            this.MAX = MAX;
        } else {
            this.MAX = MAX_PADRAO;
        }
        if (x > -MAX && x < MAX) {
            this.x = x;
        }
        if (y > -MAX && y < MAX) {
            this.y = y;
        }
    }

    public String exibir() {
        return x + ":" + y;
    }

    public void moverNorte() {
        if (y < MAX) {
            y++;
        }
    }

    public void moverSul() {
        if (y > MAX) {
            y--;
        }
    }

    public void moverLeste() {
        if (x < MAX) {
            x++;
        }
    }

    public void moverOeste() {
        if (x > MAX) {
            x--;
        }

        /*
         * switch (direcao) { 
         * case 'N': 
         * case 'n': 
         *      moverNorte(); 
         *      break; 
         * case 'S': 
         * case 's': 
         *      moverSul(); 
         *      break;
         */
    }
}