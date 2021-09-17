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

    @Test
    void deveRetornarJogadorSemTime() {
        Jogador jogador = new Jogador();
        jogador.setTime(null);
        assertEquals("jogador sem time", jogador.getNomeTime());

    }

    @Test
    void deveRetornarJogadorComTime() {
        Jogador jogador = new Jogador();
        Time time = new Time("Time de Counter Strike");
        jogador.setTime(time);
        assertEquals("Time de Counter Strike", time.getNome());

    }
}