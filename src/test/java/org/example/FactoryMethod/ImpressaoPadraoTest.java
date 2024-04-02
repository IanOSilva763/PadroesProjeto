package org.example.FactoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImpressaoPadraoTest {

    @Test
    void deveExecutarImpressao() {
        Documentar impressao = ImpressaoFactory.obterImpressao("Padrao");
        assertEquals("Impressão executada", impressao.executar());
    }

    @Test
    void deveCancelarImpressao() {
        Documentar impressao = ImpressaoFactory.obterImpressao("Padrao");
        assertEquals("Impressão cancelada", impressao.cancelar());
    }

}