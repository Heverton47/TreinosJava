public class App {
    public static void main(String[] args) throws Exception {
    Livro p1 = new Livro("O Conjurador", 2017,"Taran Matharu", 354);
    DVD p2 = new DVD("O Senhor dos Aneis",2002,"Fantasia",360);
    
    System.out.println("Detalhes do Livro");
    System.out.println(p1.toString());
    System.out.printf("\n----\n");
    System.out.println("Detalhes do DVD");
    System.out.println(p2.toString());
    }
}
