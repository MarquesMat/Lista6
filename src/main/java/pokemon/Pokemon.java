package pokemon;

import java.util.ArrayList;

public class Pokemon {
    protected  String tipo, nome;
    protected int hp, atk, def, spAtk, spDef, spd;
    protected double tamanho, peso;
    protected ArrayList<Habilidade> habilidades;
    
    public void newPokemon(String tipo, String nome, double tamanho, double peso) {
        this.tipo = tipo;
        this.nome = nome;
        this.tamanho = tamanho;
        this.peso = peso;
        this.habilidades = new ArrayList<Habilidade>();
        switch(tipo) {
            case "agua" -> {
                this.hp = 80;
                this.atk = 70;
                this.def = 80;
                this.spAtk = 90;
                this.spDef = 100;
                this.spd = 30;
            }
            case "fogo" -> {
                this.hp = 80;
                this.atk = 80;
                this.def = 70;
                this.spAtk = 100;
                this.spDef = 90;
                this.spd = 50;
            }
            case "planta" -> {
                this.hp = 90;
                this.atk = 60;
                this.def = 90;
                this.spAtk = 80;
                this.spDef = 110;
                this.spd = 20;
            }
            case "raio" -> {
                this.hp = 70;
                this.atk = 80;
                this.def = 70;
                this.spAtk = 90;
                this.spDef = 90;
                this.spd = 60;
            }
        }
    }
    
    public void evoluir(String evolucao) {
        System.out.printf("\n%s esta evoluindo para %s...\n", this.nome, evolucao);
        this.nome = evolucao;
        this.tamanho *= 1.5;
        this.peso *= 1.65;
    }
    
    public void addHabilidade(double precisao, double potencia, int qtd, String nome, String efeito) {
        Habilidade habilidade = new Habilidade(precisao, potencia, qtd, nome, efeito);
        this.habilidades.add(habilidade);
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    public double getTamanho() {
        return this.tamanho;
    }
    
    public double getPeso() {
        return this.peso;
    }
    
    public int getHP() {
        return this.hp;
    }
    
    public int getAtk() {
        return this.atk;
    }
    
    public int getDef() {
        return this.def;
    }
    
    public int getSpAtk() {
        return this.spAtk;
    }
    
    public int getSpDef() {
        return this.spDef;
    }
    
    public int getSpd() {
        return this.spd;
    }
    
    public ArrayList getHabilidades() {
        return this.habilidades;
    }
    
    public String getHabilidadeNome(int i) {
        return this.habilidades.get(i).getNome();
    }
}
