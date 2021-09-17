package Gameficada;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetorTest {

    @Test
    void deveRetornarTipo() {
        Setor setor = new Setor();
        setor.setTipo("Diretoria");
        assertEquals("Diretoria", setor.getTipo());
    }

    @Test
    void deveRetornarSemTipo() {
        Setor setor = new Setor();
        assertEquals(null, setor.getTipo());
    }

}