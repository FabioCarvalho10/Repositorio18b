package exercicio03;

public class AppEbook {
    
    public static void main(String[] args) {
        Ebook livro = new Ebook ("Como Programar em Java", "Fabio", 3);

        livro.retrocederPagina();
        System.out.println("Pagina atual: "+ livro.exibirPagina());
        livro.mostrarCapa();

        livro.avancarPagina();
        livro.avancarPagina();
        livro.avancarPagina();
        livro.avancarPagina();
        livro.avancarPagina();
        livro.avancarPagina();

        System.out.println("Pagina Atual: " + livro.exibirPagina());
    }
}

