package evento;

public class Professor extends Participante {
    private String departamento;
    
    public void newParticipante(String nome, String email,int matricula, String departamento) {
        super.newParticipante(nome, email, matricula);
        this.departamento = departamento;
    }
    
    @Override
    public String getTxt() {
        return this.departamento;
    }
}
