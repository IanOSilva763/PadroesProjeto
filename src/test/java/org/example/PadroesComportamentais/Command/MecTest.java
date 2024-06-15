package org.example.PadroesComportamentais.Command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MecTest {
    Mec mec;
    Anual anual;

    @BeforeEach
    void setUp() {
        mec = new Mec();
        anual = new Anual (2024);
    }

    @Test
    void deveAbrirCorrecao() {
        Acao aberturaCorrecao = new AberturaCorrecaoRedacaoEnem(anual);
        mec.executarAcao(aberturaCorrecao);

        assertEquals("Correcao aberta", anual.getSituacao());
    }

    @Test
    void deveFecharCorrecao() {
        Acao fechamentoCorrecao = new FechamentoCorrecaoRedacaoEnem(anual);
        mec.executarAcao(fechamentoCorrecao);

        assertEquals("Correcao fechada", anual.getSituacao());
    }

    @Test
    void deveCancelarFechamentoCorrecao() {
        Acao aberturaCorrecao = new AberturaCorrecaoRedacaoEnem(anual);
        Acao fechamentoCorrecao = new FechamentoCorrecaoRedacaoEnem(anual);

        mec.executarAcao(aberturaCorrecao);
        mec.executarAcao(fechamentoCorrecao);

        mec.cancelarUltimaAcao();

        assertEquals("Correcao aberta", anual.getSituacao());
    }
}