public class ItemBiblioteca{
    private String nome;
    private int ano;

    public ItemBiblioteca(String nome, int ano){
        this.nome = nome;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString(){
        return "Titulo: " + nome + " / Ano de Publicacao: " + ano;
    }
}