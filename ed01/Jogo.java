package ed01;

import java.util.Random;

/**
 * Controla a lógica do jogo de adivinhação.
 */
public class Jogo {
    private Jogador jogador;
    private int numeroSecreto;

    /**
     * Cria o jogo para um jogador, sorteando um número de 1 a 100.
     * 
     * @param jogador Jogador participante
     */
    public Jogo(Jogador jogador) {
        this.jogador = jogador;
        Random rand = new Random();
        this.numeroSecreto = rand.nextInt(100) + 1;
    }

    /**
     * Realiza uma tentativa de adivinhar o número.
     * 
     * @param tentativa Número tentado
     * @return Dica: "maior", "menor" ou "acertou"
     */
    public String jogar(int tentativa) {
        jogador.incrementarTentativas();

        if (tentativa < numeroSecreto) {
            return "O número secreto é maior!";
        } else if (tentativa > numeroSecreto) {
            return "O número secreto é menor!";
        } else {
            int pontos = 100 - jogador.getTentativas() * 10;
            jogador.atualizarPontuacao(pontos);
            return "Parabéns! Você acertou!";
        }
    }
}
