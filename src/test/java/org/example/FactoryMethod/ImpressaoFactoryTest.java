package org.example.FactoryMethod;

import org.example.PadroesCriacao.FactoryMethod.Documentar;
import org.example.PadroesCriacao.FactoryMethod.ImpressaoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImpressaoFactoryTest {

    @Test
    void deveRetornarExcecaoParaOpcaoInexistente() {
        try {
            Documentar impressao = ImpressaoFactory.obterImpressao("Evasao");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Opção inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaOpcaoInvalida() {
        try {
            Documentar impressao = ImpressaoFactory.obterImpressao("Scan");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Opção inválida", e.getMessage());
        }
    }
}
}