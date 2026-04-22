public class DVD extends ItemBiblioteca{
    private String categoria;
    private int duracao;

    public DVD(String nome, int ano, String categoria, int duracao){
        super(nome , ano);
        this.categoria = categoria;
        this.duracao = duracao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString(){
        return super.toString() + " / Categoria: " + categoria + " / Duracao em minutos: " + duracao;
    }
}
