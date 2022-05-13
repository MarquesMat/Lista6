package pokemon;

public class Agua extends Pokemon {
    
    public Agua(String tipo, String nome, double tamanho, double peso) {
        super.newPokemon(tipo, nome, tamanho, peso);
    }
    
    @Override
    public void evoluir(String evolucao) {
        super.evoluir(evolucao);
        this.hp *= 1.5;
        this.atk *= 1.2;
        this.def *= 1.4;
        this.spAtk *= 1.25;
        this.spDef *= 1.45;
        this.spd *= 1.2;
    }
}
