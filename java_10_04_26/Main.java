import java.util.*;

class Livro{
    private String titulo;
    private String autor;
    private int ano;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibirInfo(){
        System.out.printf("Aqui estão as informacoes do livro!\n");
        System.out.println("Titulo: " + this.titulo + " | Autor: " + this.autor + " | Ano: " + this.ano);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Livro l1 = new Livro();
        l1.setTitulo("O Espreitador");
        l1.setAutor("Daniel Hartman");
        l1.setAno(2020);
        l1.exibirInfo();

    scanner.close();
    }
}
