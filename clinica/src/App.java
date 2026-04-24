public class App {
    public static void main(String[] args) throws Exception {
        paciente p1 = new paciente("Ana", 17, "Hipertensão");
        medico m1 = new medico("Carlos", 37, "Cardiologia", "12345");
        consulta c1 = new consulta(m1, p1, "24/04/2026");

        System.out.println(c1.toString());
    }
}
