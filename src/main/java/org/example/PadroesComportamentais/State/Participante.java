package org.example.PadroesComportamentais.State;

public class Participante {
    private String nome;
    private int idade;
    private ParticipanteEstado estado;

    public Participante() {
        this.estado = ParticipanteEstadoOitavas.getInstance();
    }
    public void setEstado(ParticipanteEstado estado) {
        this.estado = estado;
    }
    public boolean irParaOitavas() {
        return estado.irParaOitavas(this);
    }
    public boolean irParaQuartas() {
        return estado.irParaQuartas(this);
    }
    public boolean irParaSemifinal() {
        return estado.irParaSemifinal(this);
    }
    public boolean irParaFinal() {
        return estado.irParaFinal(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public Participante setIdade(int idade) {
        this.idade = idade;
        return this;
    }

    public ParticipanteEstado getEstado() {
        return estado;
    }
}
