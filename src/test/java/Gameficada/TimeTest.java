package Gameficada;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

}