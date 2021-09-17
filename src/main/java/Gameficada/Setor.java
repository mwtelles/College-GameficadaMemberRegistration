package Gameficada;

public class Setor {

    private String nome;

    private String tipo;

    private String modalidade;

    private MembroAdministrador membroAdministrador;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public MembroAdministrador getMembroAdministrador() {
        return membroAdministrador;
    }

    public void setMembroAdministrador(MembroAdministrador membroAdministrador) {
        this.membroAdministrador = membroAdministrador;
    }
}
