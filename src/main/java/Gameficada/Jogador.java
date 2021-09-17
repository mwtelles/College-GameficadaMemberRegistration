package Gameficada;

public class Jogador extends  Aluno{

    private Integer id;
    private Time time;
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

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNomeTime() {
        if (this.time == null) {
            return "jogador sem time";
        }
        return this.time.getNome();
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
