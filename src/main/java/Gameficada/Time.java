package Gameficada;

public class Time {

    private Integer quantidadeJogadores;

    private Boolean status;

    private Jogador jogador;

    private Jogo jogo;

    public Integer getQuantidadeJogadores() {
        return quantidadeJogadores;
    }

    public void setQuantidadeJogadores(Integer quantidadeJogadores) {
        if (jogador == null) {
            throw new NullPointerException("Quantidade de Jogadores do Time é obrigatório");
        }
        this.quantidadeJogadores = quantidadeJogadores;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean titular) {
        this.status = titular;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        if (jogador == null) {
            throw new NullPointerException("Jogador é obrigatório");
        }
        this.jogador = jogador;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        if (jogo == null) {
            throw new NullPointerException("Jogo é obrigatório");
        }
        this.jogo = jogo;
    }

}
