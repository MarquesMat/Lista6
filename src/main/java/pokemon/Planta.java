package pokemon;

public class Planta extends Pokemon {
    public Planta(String tipo, String nome, double tamanho, double peso) {
        super.newPokemon(tipo, nome, tamanho, peso);    
    }
    
    @Override
    public void evoluir(String evolucao) {
        super.evoluir(evolucao);
        this.hp *= 1.7;
        this.atk *= 1.1;
        this.def *= 1.5;
        this.spAtk *= 1.15;
        this.spDef *= 1.75;
        this.spd *= 1.1;
    }
}
