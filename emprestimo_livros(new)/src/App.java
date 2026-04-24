public class App {
    public static void main(String[] args) throws Exception {
        cliente c1 = new cliente("Carlos Silva", 25);
        livro l1 = new livro("O Espreitador", "Daniel Hartman");
        emprestimo e1 = new emprestimo(c1, l1, "24/04/2026");
        
        System.out.println(e1.toString());
    }
}