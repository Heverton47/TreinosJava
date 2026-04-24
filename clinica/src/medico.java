public class medico extends pessoa{
    private String especialidade;
    private String crm;

    public medico(String nome, int idade, String especialidade, String crm) {
        super(nome, idade);
        this.especialidade = especialidade;
        this.crm = crm;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public String getCrm() {
        return crm;
    }
}
