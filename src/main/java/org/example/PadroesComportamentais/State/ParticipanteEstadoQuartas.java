package org.example.PadroesComportamentais.State;

public class ParticipanteEstadoQuartas extends ParticipanteEstado{
    private ParticipanteEstadoQuartas() {};
    private static ParticipanteEstadoQuartas instance = new ParticipanteEstadoQuartas();
    public static ParticipanteEstadoQuartas getInstance() {
        return instance;
    }
    public String getEstado() {
        return "Participante disputando quartas de final";
    }
    public boolean irParaSemifinal(Participante participante) {
        participante.setEstado(ParticipanteEstadoSemifinal.getInstance());
        return true;
    }
}
