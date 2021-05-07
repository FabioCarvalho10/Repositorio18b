package exemplos;

public class Exemplo05 {
    public static void main(String[] args) {
        int numInteiro;
        double numDouble;

        //numInteiro = 12;
        //numDouble = numInteiro;

        numDouble = 12.5465;
        numInteiro = (int) numDouble; // casting
        System.out.println("I: " + numInteiro);
        System.out.println("D: " + numDouble);
        System.out.printf("%d\n", (int) numDouble);
        System.out.println(((2 + (3 * 5)) > 10) && (3 < 2));
    }
}
