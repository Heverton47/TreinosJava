import java.util.*;

public class App {
    public static void menuPrincipal(){
        System.out.println("\n======= AGENDA =======");
        System.out.println("[1] Adicionar contato");
        System.out.println("[2] Editar contato");
        System.out.println("[3] Excluir contato");
        System.out.println("[4] Listar contatos");
        System.out.println("[5] Sair");
        System.out.print("\nEscolha uma opcao: ");
    }
 
    public static void menuEditar(){
        System.out.println("\n=== EDITAR CONTATO ===");
        System.out.println("[1] Editar telefone");
        System.out.println("[2] Editar email");
        System.out.println("[3] Voltar");
        System.out.print("\nEscolha uma opcao: ");
    }

    public static void adicionarContato(Scanner scanner, ArrayList<Contato> contatos){
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
 
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
 
        System.out.print("Email: ");
        String email = scanner.nextLine();

        contatos.add(new Contato(nome, telefone, email));
 
        System.out.println("Contato adicionado!");
    }

    public static void removerContato(Scanner scanner, ArrayList<Contato> contatos){
        System.out.print("Qual contato você deseja remover: ");
        
        String apagar = scanner.nextLine();
        boolean encontrado = false;

        for(int i = 0; i < contatos.size(); i++){
            if(contatos.get(i).getNome().equalsIgnoreCase(apagar) ||
               contatos.get(i).getEmail().equalsIgnoreCase(apagar) ||
               contatos.get(i).getTelefone().equalsIgnoreCase(apagar)){
                encontrado = true;
                contatos.remove(i);
                System.out.print("\nContato removido!\n");
                break;
            }
        }
        if(!encontrado){
            System.out.println("Contato nao encontrado");
        }

    }

    public static void listarContatos(ArrayList<Contato> contatos){
        
        if(contatos.isEmpty()){
            System.out.println("Agenda vazia!");
            return;
        }
        
        System.out.printf("%-20s | %-15s | %-20s\n", "Nome", "Telefone", "Email");
        
        for(int i = 0; i < contatos.size(); i++){
            System.out.printf("%-20s | %-15s | %-20s\n",
            contatos.get(i).getNome(),
            contatos.get(i).getTelefone(),
            contatos.get(i).getEmail());
        }
    }

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    ArrayList<Contato> contatos = new ArrayList<>();

    int num = 0;    
    while(num < 5){
        menuPrincipal();
        num = scanner.nextInt();
        scanner.nextLine();
        
        switch (num) {
            case 1:
                adicionarContato(scanner, contatos);
                break;
            
            case 2:
            menuEditar();
            num = scanner.nextInt();
            scanner.nextLine();
                    if(num == 1){
                    System.out.print("Digite telefone a ser alterado: ");
                    
                    String telefone = scanner.nextLine();
                    boolean encontrado = false;
                    for(int i = 0; i < contatos.size(); i++){
                        if(contatos.get(i).getTelefone().equalsIgnoreCase(telefone)){
                            encontrado = true;
                            System.out.print("Digite o novo telefone: ");
                            telefone = scanner.nextLine();
                            
                            contatos.get(i).setTelefone(telefone);
                            System.out.println("Novo telefone: " + contatos.get(i).getTelefone());
                            break; 
                        }
                    }
                    if(!encontrado){
                        System.out.println("Telefone nao encontrado!");
                    }
                    }
                    else if (num == 2) {
                        System.out.print("Digite Email a ser alterado: ");
                        
                        String email = scanner.nextLine();
                        boolean encontrado = false;
                        for(int i = 0; i < contatos.size(); i++){
                            if(contatos.get(i).getEmail().equalsIgnoreCase(email)){
                                encontrado = true;
                                System.out.print("Digite o novo Email: ");
                                email = scanner.nextLine();
                            
                                contatos.get(i).setEmail(email);
                                System.out.println("Novo Email: " + contatos.get(i).getEmail());
                                break; 
                            }
                        }
                    if(!encontrado){
                        System.out.println("Email nao encontrado!");
                    }
                    }
                    else if (num == 3) {
                        break;
                    }
                break;

            case 3:
            removerContato(scanner, contatos);
                break;

            case 4:
            listarContatos(contatos);
                break;

            default:
                System.out.println("Até a próxima parceiro!");
                break;
        }
        }
    scanner.close();
    }    
}