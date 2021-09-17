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
        if (nome == null) {
            throw new NullPointerException("Nome é obrigatório");
        }
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo == null) {
            throw new NullPointerException("Tipo é obrigatório");
        }
        this.tipo = tipo;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        if (modalidade == null) {
            throw new NullPointerException("Modalidade é obrigatório");
        }
        this.modalidade = modalidade;
    }

    public MembroAdministrador getMembroAdministrador() {
        return membroAdministrador;
    }

    public void setMembroAdministrador(MembroAdministrador membroAdministrador) {
        if (membroAdministrador == null) {
            throw new NullPointerException("Membro Administrador é obrigatório");
        }
        this.membroAdministrador = membroAdministrador;
    }
}
