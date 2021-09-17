package Gameficada;

public class MembroAdministrador extends Aluno {

    private Integer id;
    private Setor setor;
    private Aluno aluno;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        if (id == null) {
            throw new NullPointerException("Id é obrigatório");
        }
        this.id = id;
    }

    public Setor getSetor() {
        return this.setor;
    }

    public void setSetor(Setor setor) {
        if (setor == null) {
            throw new NullPointerException("Setor é obrigatório");
        }
        this.setor = setor;
    }

    public Aluno getAluno() {
        return this.aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
