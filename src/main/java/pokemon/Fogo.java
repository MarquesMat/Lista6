package pokemon;

public class Fogo extends Pokemon {
    public Fogo(String tipo, String nome, double tamanho, double peso) {
        super.newPokemon(tipo, nome, tamanho, peso);    
    }
    
    @Override
    public void evoluir(String evolucao) {
        super.evoluir(evolucao);
        this.hp *= 1.2;
        this.atk *= 1.5;
        this.def *= 1.2;
        this.spAtk *= 1.55;
        this.spDef *= 1.25;
        this.spd *= 1.3;
    }
}
