package Gameficada;

public class Jogo {

    private String modalidade;

    private String tipo;

    private String dispositivo;

    private Setor setor;

    private Time time;

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        if (modalidade == null) {
            throw new NullPointerException("Modalidade é obrigatório");
        }
        this.modalidade = modalidade;
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

    public String getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(String dispositivo) {
        if (dispositivo == null) {
            throw new NullPointerException("Dispositivo é obrigatório");
        }
        this.dispositivo = dispositivo;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        if (setor == null) {
            throw new NullPointerException("Setor é obrigatório");
        }
        this.setor = setor;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        if (time == null) {
            throw new NullPointerException("Time é obrigatório");
        }
        this.time = time;
    }
}
