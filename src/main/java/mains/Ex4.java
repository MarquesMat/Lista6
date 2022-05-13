package mains;

import pokemon.*;

public class Ex4 {
    public static void main(String[] args) {
        Agua squirtle = new Agua("agua", "Squirtle", 80, 5.6);
        squirtle.addHabilidade(0.8, 1.4, 3, "JATO D'AGUA", "Nenhum.");
        squirtle.addHabilidade(1, 1.1, 10, "CABECADA", "LENTIDAO - O oponente tem sua velocidade reduzida.");
        squirtle.addHabilidade(1.1, 1.2, 5, "MORDIDA", "Nenhum.");
        Pokedex.addPokemon(squirtle);
        Fogo charmander = new Fogo("fogo", "Charmander", 85, 4.9);
        charmander.addHabilidade(1.2, 1.4, 3, "LANCA-CHAMAS", "Nenhum.");
        charmander.addHabilidade(1.1, 1.2, 5, "MORDIDA", "Nenhum.");
        charmander.addHabilidade(100, 0, 2, "IGNICAO", "ACENDER - O pokemon tem seu ataque especial aumentado");
        Pokedex.addPokemon(charmander);
        Planta bulbassauro = new Planta("planta", "Bulbassauro", 70, 4.8);
        bulbassauro.addHabilidade(100, 0, 1, "REGENERAR", "VITALIDADE - O pokemon recebe mais hit points");
        bulbassauro.addHabilidade(1, 1.1, 10, "CABECADA", "LENTIDAO - O oponente tem sua velocidade reduzida.");
        bulbassauro.addHabilidade(1.6, 0.9, 5, "EXPLOSAO DE SEMENTES", "Nenhum.");
        Pokedex.addPokemon(bulbassauro);
        Raio pikachu = new Raio("raio", "Pikachu", 85, 4.6);
        pikachu.addHabilidade(1.4, 1.3, 3, "CHOQUE DO TROVAO", "Nenhum");
        pikachu.addHabilidade(0.8, 1.2, 5, "INVESTIDA", "VELOCIDADE - O pokemon tem sua velocidade aumenta.");
        pikachu.addHabilidade(1.4, 1.3, 3, "CAUDA DE ACO", "Nenhum.");
        Pokedex.addPokemon(pikachu);
        Pokedex.imprimirPokedex();
        pikachu.evoluir("Raichu");
        squirtle.evoluir("Wartortle");
        Pokedex.imprimirPokedex();
    }
}
