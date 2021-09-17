package Gameficada;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MembroAdministradorTest {

    @Test
    void deveRetornarAluno() {
        Aluno aluno = new Aluno();
        aluno.setNome("Matheus Nunes Almeida Werneck Telles");
        MembroAdministrador membroAdministrador = new MembroAdministrador();
        membroAdministrador.setAluno(aluno);
        assertEquals(aluno.getClass(), membroAdministrador.getAluno().getClass());
    }

    @Test
    void deveRetornarSemAluno() {
        Aluno aluno = new Aluno();
        aluno.setNome("Matheus Nunes Almeida Werneck Telles");
        MembroAdministrador membroAdministrador = new MembroAdministrador();
        assertEquals(null, membroAdministrador.getAluno());

    }
}