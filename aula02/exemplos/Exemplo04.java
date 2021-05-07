package exemplos;

public class Exemplo04 {
    public static void main(String[] args) {
        int cont;

        cont = 5;

        while (cont <= 10){
            System.out.println(cont);
           // cont++; // cont = cont + 1;
            cont += 2; // ou cont = cont + 2;

        }
        System.out.println("Valor final: " + cont);
    }
}
