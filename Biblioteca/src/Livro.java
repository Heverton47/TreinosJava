public class Livro extends ItemBiblioteca{
    private String autor;
    private int numPaginas;

    public Livro(String nome, int ano, String autor, int numPaginas){
        super(nome , ano);
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString(){
        return super.toString() + " / Autor: " + autor + " / Numero de paginas: " + numPaginas;
    }
}
