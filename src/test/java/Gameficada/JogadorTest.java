package Gameficada;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {

    @Test
    void deveRetornarAluno() {
        Aluno aluno = new Aluno();
        aluno.setNome("Matheus Nunes Almeida Werneck Telles");
        Jogador jogador = new Jogador();
        jogador.setAluno(aluno);
        assertEquals(aluno.getClass(), jogador.getAluno().getClass());
    }

    @Test
    void deveRetornarSemAluno() {
        Aluno aluno = new Aluno();
        aluno.setNome("Matheus Nunes Almeida Werneck Telles");
        Jogador jogador = new Jogador();
        assertEquals(null, jogador.getAluno());

    }
}