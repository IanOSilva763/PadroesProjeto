package org.example.PadroesComportamentais.State;

public class ParticipanteEstadoOitavas extends ParticipanteEstado{
    private ParticipanteEstadoOitavas() {};
    private static ParticipanteEstadoOitavas instance = new ParticipanteEstadoOitavas();
    public static ParticipanteEstadoOitavas getInstance() {
        return instance;
    }
    public String getEstado() {
        return "Participante disputando oitavas de final";
    }

    public boolean irParaQuartas(Participante participante) {
        participante.setEstado(ParticipanteEstadoQuartas.getInstance());
        return true;
    }
}
