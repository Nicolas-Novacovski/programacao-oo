package ed01;

/**
 * Representa um jogador no jogo.
 * Armazena nome, tentativas e pontuação.
 */
public class Jogador {
    private String nome;
    private int tentativas;
    private int pontuacao;

    /**
     * Cria um novo jogador com o nome informado.
     * 
     * @param nome Nome do jogador
     */
    public Jogador(String nome) {
        this.nome = nome;
        this.tentativas = 0;
        this.pontuacao = 0;
    }

    /**
     * Retorna o nome do jogador.
     * 
     * @return nome
     */
    public String getNome() { return nome; }

    /**
     * Define o nome do jogador.
     * 
     * @param nome Nome a ser definido
     */
    public void setNome(String nome) { this.nome = nome; }

    /** @return quantidade de tentativas */
    public int getTentativas() { return tentativas; }

    /** @param tentativas Nova quantidade de tentativas */
    public void setTentativas(int tentativas) { this.tentativas = tentativas; }

    /** @return pontuação atual */
    public int getPontuacao() { return pontuacao; }

    /** @param pontuacao Nova pontuação */
    public void setPontuacao(int pontuacao) { this.pontuacao = pontuacao; }

    /** Incrementa 1 tentativa ao total do jogador. */
    public void incrementarTentativas() { tentativas++; }

    /**
     * Atualiza a pontuação do jogador somando o valor informado.
     * 
     * @param valor Pontos a serem somados
     */
    public void atualizarPontuacao(int valor) {
        this.pontuacao += valor;
    }
}
