package evento;

public class Funcionario extends Participante {
    private String cargo;
    
    public void newParticipante(String nome, String email,int matricula, String cargo) {
        super.newParticipante(nome, email, matricula);
        this.cargo = cargo;
    }
    
    @Override
    public String getTxt() {
        return this.cargo;
    }
}
