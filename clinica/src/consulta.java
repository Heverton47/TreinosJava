public class consulta {
    private medico medico;
    private paciente paciente;
    private String dtaConsulta;

    public consulta(medico medico, paciente paciente, String dtaConsulta) {
        this.medico = medico;
        this.paciente = paciente;
        this.dtaConsulta = dtaConsulta;
    }

@Override
public String toString(){
return "Consulta em " + dtaConsulta + "\nDr(a). " + medico.getNome() + " - " + medico.getEspecialidade() +
" (" + medico.getCrm() + ")\nPaciente: " + paciente.getNome() + " - Enfermidade: " + paciente.getEnfermidade();
}
}
