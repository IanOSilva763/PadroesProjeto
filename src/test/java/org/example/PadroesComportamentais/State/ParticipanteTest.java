package org.example.PadroesComportamentais.State;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParticipanteTest {
    Participante participante;

    @BeforeEach
    public void setUp() {
        participante = new Participante();
    }

    @Test
    public void naoDeveIrDeOitavasParaOitavas() {
        participante.setEstado(ParticipanteEstadoOitavas.getInstance());
        assertFalse(participante.irParaOitavas());
    }

    @Test
    public void deveIrDeOitavasParaQuartas() {
        participante.setEstado(ParticipanteEstadoOitavas.getInstance());
        assertTrue(participante.irParaQuartas());
        assertEquals(ParticipanteEstadoQuartas.getInstance(), participante.getEstado());
    }

    @Test
    public void naoDeveIrDeOitavasParaSemifinal() {
        participante.setEstado(ParticipanteEstadoOitavas.getInstance());
        assertFalse(participante.irParaSemifinal());
    }

    @Test
    public void naoDeveIrDeOitavasParaFinal() {
        participante.setEstado(ParticipanteEstadoOitavas.getInstance());
        assertFalse(participante.irParaFinal());
    }

    @Test
    public void naoDeveIrDeQuartasParaOitavas() {
        participante.setEstado(ParticipanteEstadoQuartas.getInstance());
        assertFalse(participante.irParaOitavas());
    }

    @Test
    public void naoDeveIrDeQuartasParaQuartas() {
        participante.setEstado(ParticipanteEstadoQuartas.getInstance());
        assertFalse(participante.irParaQuartas());
    }

    @Test
    public void deveIrDeQuartasParaSemifinal() {
        participante.setEstado(ParticipanteEstadoQuartas.getInstance());
        assertTrue(participante.irParaSemifinal());
        assertEquals(ParticipanteEstadoSemifinal.getInstance(), participante.getEstado());
    }

    @Test
    public void naoDeveIrDeQuartasParaFinal() {
        participante.setEstado(ParticipanteEstadoQuartas.getInstance());
        assertFalse(participante.irParaFinal());
    }

    @Test
    public void naoDeveIrDeSemifinalParaOitavas() {
        participante.setEstado(ParticipanteEstadoSemifinal.getInstance());
        assertFalse(participante.irParaOitavas());
    }

    @Test
    public void naoDeveIrDeSemifinalParaQuartas() {
        participante.setEstado(ParticipanteEstadoSemifinal.getInstance());
        assertFalse(participante.irParaQuartas());
    }

    @Test
    public void naoDeveIrDeSemifinalParaSemifinal() {
        participante.setEstado(ParticipanteEstadoSemifinal.getInstance());
        assertFalse(participante.irParaSemifinal());
    }

    @Test
    public void deveIrDeSemifinalParaFinal() {
        participante.setEstado(ParticipanteEstadoSemifinal.getInstance());
        assertTrue(participante.irParaFinal());
        assertEquals(ParticipanteEstadoFinal.getInstance(), participante.getEstado());
    }

    @Test
    public void naoDeveIrDeFinalParaOitavas() {
        participante.setEstado(ParticipanteEstadoFinal.getInstance());
        assertFalse(participante.irParaOitavas());
    }

    @Test
    public void naoDeveIrDeFinalParaQuartas() {
        participante.setEstado(ParticipanteEstadoFinal.getInstance());
        assertFalse(participante.irParaQuartas());
    }

    @Test
    public void naoDeveIrDeFinalParaSemifinal() {
        participante.setEstado(ParticipanteEstadoFinal.getInstance());
        assertFalse(participante.irParaSemifinal());
    }

    @Test
    public void naoDeveIrDeFinalParaFinal() {
        participante.setEstado(ParticipanteEstadoFinal.getInstance());
        assertFalse(participante.irParaFinal());
    }
}