package agenda;

public class Pessoa {
    protected String endereco, texto; //nome ou razão social
    protected String numero; //CPF ou CNPJ
    
    public void newPessoa(String num, String txt, String end) {
        this.numero = num;
        this.texto = txt;
        this.endereco = end;
    }
    
    public String getNumero() {
        return this.numero;
    }
    
    public String getTexto() {
        return this.texto;
    }
    
    public String getEndereco() {
        return this.endereco;
    }
    
    public String getAniversario() {
        return ("");
    }
    
    public float getFaturamento() {
        return 0;
    }
    
    /*
    public void setNum(String num) {
        this.numero = num;
    }
    
    public void setTexto(String txt) {
        this.texto = txt;
    }
    
    public void setEnd(String end) {
        this.endereco = end;
    }
    */
}
