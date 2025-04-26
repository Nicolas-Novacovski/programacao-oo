package ed01;

import java.util.Scanner;

/**
 * Classe principal que executa o jogo.
 * Permite que um jogador tente adivinhar um número entre 1 e 100.
 * Exibe tentativas, pontuação e ranking ao final.
 */

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Placar placar = new Placar();

        System.out.print("Digite o nome do jogador: ");
        String nome = teclado.nextLine();

        Jogador jogador = new Jogador(nome);
        Jogo jogo = new Jogo(jogador);

        boolean acertou = false;

        while (!acertou) {
            System.out.print("Tente adivinhar o número (1 a 100): ");
            int tentativa = teclado.nextInt();
            String resultado = jogo.jogar(tentativa);
            System.out.println(resultado);

            if (resultado.equals("Parabéns! Você acertou!")) {
                acertou = true;
            }
        }

        System.out.println("\n✅ Tentativas: " + jogador.getTentativas());
        System.out.println("⭐ Pontuação final: " + jogador.getPontuacao());

        placar.adicionarJogador(jogador);
        placar.mostrarRanking();

        teclado.close();
    }
}
