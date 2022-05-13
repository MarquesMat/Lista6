package evento;

public class Aluno extends Participante {
    private String curso;
        
    public void newParticipante(String nome, String email,int matricula, String curso) {
        super.newParticipante(nome, email, matricula);
        this.curso = curso;
    }
    
    @Override
    public String getTxt() {
        return this.curso;
    }
}
