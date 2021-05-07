package exercicio03;

public class Ebook {
    private String titulo, autor;
    private int totalPaginas, paginaAtual;

    public Ebook(String titulo, String autor, int totalPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = 0;
    }

    public void avancarPagina() {
        if (paginaAtual < totalPaginas) {
            this.paginaAtual++;
        }
    }

    public void retrocederPagina() {
        if (paginaAtual > 0) {
            this.paginaAtual--;
        }
    }

    public void irParaPagina(int pagina) {
        if (pagina >= 0 && pagina < totalPaginas) {
            paginaAtual = pagina;
            System.out.println("Página: " + paginaAtual);
        }
    }

    public int exibirPagina() {
        return paginaAtual;
    }

    public void mostrarCapa() {
        paginaAtual = 0;
        System.out.println(titulo + " - " + autor + " - " + totalPaginas);
    }
}
