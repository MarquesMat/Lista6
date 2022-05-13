package pokemon;

import java.util.ArrayList;

public class Pokedex {
    private static ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
    
    public static void addPokemon(Pokemon pokemon) {
        pokedex.add(pokemon);
    }
    
    public static void imprimirPokedex() {
        System.out.println("\n---POKEDEX---");
        for (Pokemon pokemon: pokedex) {
            System.out.printf("\nNOME: %s\n", pokemon.getNome());
            System.out.printf("TIPO: %s\n", pokemon.getTipo());
            System.out.printf("HP:  %d  ATK:    %d  DEF:    %d\n", pokemon.getHP(), pokemon.getAtk(), pokemon.getDef());
            System.out.printf("SPD: %d  SP.ATK: %d  SP.DEF: %d\n", pokemon.getSpd(), pokemon.getSpAtk(), pokemon.getSpDef());
            System.out.printf("HABILIDADES:\n");
            for (int i=0; i<pokemon.getHabilidades().size(); i++) {
                System.out.printf("-> %s\n", pokemon.getHabilidadeNome(i));
            }
        }
    }
}
