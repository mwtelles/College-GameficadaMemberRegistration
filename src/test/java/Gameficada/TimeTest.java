package Gameficada;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.easymock.EasyMock.*;

class TimeTest {

    @Test
    void deveRetornarQuantidadeJogadores() {
        Time time = new Time("Time de Counter Strike");
        time.setQuantidadeJogadores(5);
        assertEquals(5, time.getQuantidadeJogadores());
    }

    @Test
    void deveRetornarSemQuantidadeJogadores() {
        Time time = new Time("Time de Counter Strike");
        assertEquals(null, time.getQuantidadeJogadores());
    }

    @Test
    void deveRetornarExcecaoQuantidadeJogadoresNula() {
        try {
            Time time = new Time("Time de Counter Strike");
            time.setQuantidadeJogadores(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Quantidade de Jogadores do Time é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarNomeDoJogo() {
        Jogo jogo = createMock(Jogo.class);
        expect(jogo.getNome()).andReturn("Counter Strike");
        replay(jogo);

        Time time = new Time("Time de Counter Strike");
        time.setJogo(jogo);
        assertEquals("Counter Strike", time.getNomeJogo());

    }

    @Test
    void deveRetornarJogador() {
        Jogador jogador = createMock(Jogador.class);

        Time time = new Time("Counter Strike");
        time.setJogador(jogador);
        assertEquals(jogador, time.getJogador());

    }

    @Test
    void deveRetornarNomeDoJogador() {
        Jogador jogador = createMock(Jogador.class);
        expect(jogador.getNome()).andReturn("Rodolfo");
        replay(jogador);

        Time time = new Time("Counter Strike");
        time.setJogador(jogador);
        assertEquals("Rodolfo", time.getNomeJogador());

    }

    @Test
    void deveRetornarMatriculaDoJogador() {
        Jogador jogador = createMock(Jogador.class);
        expect(jogador.getMatricula()).andReturn("16167801770");
        replay(jogador);

        Time time = new Time("Counter Strike");
        time.setJogador(jogador);
        assertEquals("16167801770", time.getMatriculaJogador());

    }

}