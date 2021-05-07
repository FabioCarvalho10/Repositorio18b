package exemplos;

public class Exemplo03 {
    public static void main(String[] args) {
        String palavra1 = "Fabio";
        String palavra2 = "Carvalho";
        boolean iguais;
        
        iguais = palavra1.equals(palavra2);

        if (iguais){// Considera diferença entre maisculas/minusculas
            System.out.println("Iguais");
        } else{
            System.out.println("Diferente");
        }
        if (palavra1.equalsIgnoreCase(palavra2)){//Não considera diferença entre maiusculas/minusculas
            System.out.println("Iguais");
        } else{
            System.out.println("Diferente");
        }
    }
}