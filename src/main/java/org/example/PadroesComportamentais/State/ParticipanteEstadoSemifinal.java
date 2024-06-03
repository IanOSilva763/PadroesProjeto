package org.example.PadroesComportamentais.State;

public class ParticipanteEstadoSemifinal extends ParticipanteEstado{
    private ParticipanteEstadoSemifinal() {};
    private static ParticipanteEstadoSemifinal instance = new ParticipanteEstadoSemifinal();
    public static ParticipanteEstadoSemifinal getInstance() {
        return instance;
    }
    public String getEstado() {
        return "Participante semifinalista";
    }
    public boolean irParaFinal(Participante participante) {
        participante.setEstado(ParticipanteEstadoFinal.getInstance());
        return true;
    }
}
