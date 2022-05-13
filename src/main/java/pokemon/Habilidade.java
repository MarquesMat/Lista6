package pokemon;

public class Habilidade {
    private double precisao, potencia;
    private int qtd;
    private String nome, efeito;
    
    public Habilidade(double precisao, double potencia, int qtd, String nome, String efeito) {
        this.nome = nome;
        this.precisao = precisao;
        this.potencia = potencia;
        this.qtd = qtd;
        this.efeito = efeito;
    }
    
    public String getNome() {
        return this.nome;
    }
}
