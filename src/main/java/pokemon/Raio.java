package pokemon;

public class Raio extends Pokemon {
    public Raio(String tipo, String nome, double tamanho, double peso) {
        super.newPokemon(tipo, nome, tamanho, peso);
    }
    
    @Override
    public void evoluir(String evolucao) {
        super.evoluir(evolucao);
        this.hp *= 1.3;
        this.atk *= 1.4;
        this.def *= 1.2;
        this.spAtk *= 1.45;
        this.spDef *= 1.25;
        this.spd *= 1.5;
    }
}
