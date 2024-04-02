package org.example.FactoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImpressaoPretaBrancaTest {

    @Test
    void deveExecutarImpressaoPretaBranca() {
        Documentar impressao = ImpressaoFactory.obterImpressao("PretaBranca");
        assertEquals("Impressão preta e branca executada", impressao.executar());
    }

    @Test
    void deveCancelarImpressao() {
        Documentar impressao = ImpressaoFactory.obterImpressao("PretaBranca");
        assertEquals("Impressão preta e branca cancelada", impressao.cancelar());
    }

}