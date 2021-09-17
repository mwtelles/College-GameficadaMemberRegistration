package Gameficada;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveRetornarMatricula() {
        Aluno aluno = new Aluno();
        aluno.setMatricula("201910992");
        assertEquals("201910992", aluno.getMatricula());
    }

    @Test
    void deveRetornarSemMatricula() {
        Aluno aluno = new Aluno();
        assertEquals(null, aluno.getMatricula());
    }
}