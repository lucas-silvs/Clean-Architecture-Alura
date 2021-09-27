package escola;

import java.time.LocalDateTime;

public class Indicacao {

    private Aluno indicante;
    private Aluno indicado;
    private LocalDateTime dataIndicacao;

    public Indicacao(Aluno indicante, Aluno indicado) {
        this.indicante = indicante;
        this.indicado = indicado;
        this.dataIndicacao = LocalDateTime.now();
    }

    public Aluno getIndicante() {
        return indicante;
    }

    public void setIndicante(Aluno indicante) {
        this.indicante = indicante;
    }

    public Aluno getIndicado() {
        return indicado;
    }

    public void setIndicado(Aluno indicado) {
        this.indicado = indicado;
    }

    public LocalDateTime getDataIndicacao() {
        return dataIndicacao;
    }

    public void setDataIndicacao(LocalDateTime dataIndicacao) {
        this.dataIndicacao = dataIndicacao;
    }
}
