package agenda;

public class PessoaFisica extends Pessoa {
    private String aniversario;
    
    public void newPessoa(String num, String txt, String end, String ani) {
        super.newPessoa(num, txt, end);
        this.aniversario = ani;
    }
    
    @Override
    public String getAniversario() {
        return this.aniversario;
    }
}
