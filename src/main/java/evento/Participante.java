package evento;

public class Participante {
    protected String nome, email;
    protected int matricula;
    
    public void newParticipante (String nome, String email,int matricula) {
        this.nome = nome;
        this.email = email;
        this.matricula = matricula;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public int getMatricula() {
        return this.matricula;
    }
    
    public String getTxt() { //Retorna a ocupação do participante
        return ("");
    }
}