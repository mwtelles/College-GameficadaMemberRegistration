package Gameficada;

public class Time {

    private Integer quantidadeJogadores;

    private Boolean titular;

    private Jogador jogador;

    private Jogo jogo;

    public Integer getQuantidadeJogadores() {
        return quantidadeJogadores;
    }

    public void setQuantidadeJogadores(Integer quantidadeJogadores) {
        this.quantidadeJogadores = quantidadeJogadores;
    }

    public Boolean getTitular() {
        return titular;
    }

    public void setTitular(Boolean titular) {
        this.titular = titular;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }
}
