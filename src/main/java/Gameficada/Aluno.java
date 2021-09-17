package Gameficada;

public class Aluno {

    private String nome;
    private String matricula;
    private String cpf;
    private String curso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            throw new NullPointerException("Nome é obrigatório");
        }
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula == null) {
            throw new NullPointerException("Matricula é obrigatório");
        }
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null) {
            throw new NullPointerException("CPF é obrigatório");
        }
        this.cpf = cpf;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        if (curso == null) {
            throw new NullPointerException("Curso é obrigatório");
        }
        this.curso = curso;
    }
}



