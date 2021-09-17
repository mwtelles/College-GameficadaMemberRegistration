package Gameficada;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetorTest {

    @Test
    void deveRetornarMembroAdministradorDoSetor() {
        MembroAdministrador membroAdministrador = new MembroAdministrador();
        membroAdministrador.setNome("Matheus Telles");
        Setor setor = new Setor();
        setor.setMembroAdministrador(membroAdministrador);
        assertEquals("Matheus Telles", setor.getMembroAdministrador().getNome());
    }

    @Test
    void deveRetornarSemMembroAdministradorDoSetor() {
        try {
            Setor setor = new Setor();
            setor.setMembroAdministrador(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Membro Administrador é obrigatório", e.getMessage());
        }
    }

}