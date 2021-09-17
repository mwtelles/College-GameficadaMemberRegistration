package Gameficada;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void deveRetornarQuantidadeJogadores() {
        Time time = new Time();
        time.setQuantidadeJogadores(5);
        assertEquals(5, time.getQuantidadeJogadores());
    }

    @Test
    void deveRetornarSemQuantidadeJogadores() {
        Time time = new Time();
        assertEquals(null, time.getQuantidadeJogadores());
    }

}