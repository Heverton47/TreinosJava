public class emprestimo {
    private cliente cliente;
    private livro livro;
    private String dtaEmprestimo;

    public emprestimo(cliente cliente, livro livro, String dtaEmprestimo) {
        this.cliente = cliente;
        this.livro = livro;
        this.dtaEmprestimo = dtaEmprestimo;
    }

    @Override
    public String toString(){
        return "Dados do Emprestimo:\nCliente: " + cliente.getNome() + " (Idade" + cliente.getIdade() + 
        ")\nLivro: " + livro.getTitulo() + " por " + livro.getAutor() + "\nData do empréstimo: " + 
        dtaEmprestimo;
    }
}
