package org.example.PadroesCriacao.Prototype;

public class Atualizacao implements Cloneable {
    private String horario;
    private String qtVotos;

    public Atualizacao(String horario, String qtVotos) {
        super();
        this.setHorario(horario);
        this.setQtVotos(qtVotos);
    }

    public String getHorario() {
        return horario;
    }

    public Atualizacao setHorario(String horario) {
        this.horario = horario;
        return this;
    }

    public String getQtVotos() {
        return qtVotos;
    }

    public Atualizacao setQtVotos(String qtVotos) {
        this.qtVotos = qtVotos;
        return this;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Atualizacao{" +
                "horario='" + horario + '\'' +
                ", qtVotos=" + qtVotos +
                '}';
    }
}
