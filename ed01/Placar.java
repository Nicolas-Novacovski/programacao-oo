package ed01;

import java.util.ArrayList;

/**
 * Gerencia o ranking dos jogadores e suas pontuações.
 */
public class Placar {
    private ArrayList<Jogador> ranking;

    /** Cria um placar vazio. */
    public Placar() {
        ranking = new ArrayList<>();
    }

    /**
     * Adiciona um jogador ao ranking.
     * 
     * @param j Jogador a ser adicionado
     */
    public void adicionarJogador(Jogador j) {
        ranking.add(j);
    }

    /** Mostra o ranking com nome e pontuação dos jogadores. */
    public void mostrarRanking() {
        System.out.println("\n📊 Ranking:");
        for (Jogador j : ranking) {
            System.out.println(j.getNome() + " - " + j.getPontuacao() + " pontos");
        }
    }
}
