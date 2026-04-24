public class paciente extends pessoa{
    private String enfermidade;

    public paciente(String nome, int idade, String enfermidade) {
        super(nome, idade);
        this.enfermidade = enfermidade;
    }
    public String getEnfermidade() {
        return enfermidade;
    } 
}
