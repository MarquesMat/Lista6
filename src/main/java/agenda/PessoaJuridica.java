package agenda;

public class PessoaJuridica extends Pessoa {
    private float faturamento;
    
    public void newPessoa(String num, String txt, String end, float fat) {
        super.newPessoa(num, txt, end);
        this.faturamento = fat;
    }
    
    @Override
    public float getFaturamento() {
        return this.faturamento;
    }
}
