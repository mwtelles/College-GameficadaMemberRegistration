package Gameficada;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogoTest {

    @Test
    void deveRetornarModalidade() {
        Jogo jogo = new Jogo();
        jogo.setModalidade("MOBA");
        assertEquals("MOBA", jogo.getModalidade());
    }

    @Test
    void deveRetornarSemModalidade() {
        Jogo jogo = new Jogo();
        assertEquals(null, jogo.getModalidade());
    }

}