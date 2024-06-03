package org.example.PadroesComportamentais.State;

public abstract class ParticipanteEstado {
    public abstract String getEstado();

    public boolean irParaOitavas(Participante participante) {
        return false;
    }

    public boolean irParaQuartas(Participante participante) {
        return false;
    }

    public boolean irParaSemifinal(Participante participante) {
        return false;
    }

    public boolean irParaFinal(Participante participante) {
        return false;
    }
}
