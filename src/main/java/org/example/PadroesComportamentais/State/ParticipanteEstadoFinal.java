package org.example.PadroesComportamentais.State;

public class ParticipanteEstadoFinal extends ParticipanteEstado{
    private ParticipanteEstadoFinal() {};
    private static ParticipanteEstadoFinal instance = new ParticipanteEstadoFinal();
    public static ParticipanteEstadoFinal getInstance() {
        return instance;
    }
    public String getEstado() {
        return "Participante finalista";
    }
}
