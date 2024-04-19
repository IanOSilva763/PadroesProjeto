package org.example.PadroesEstruturais.FacadeBuilder;

import org.example.PadroesCriacao.FactoryMethod.Documentar;
import org.example.PadroesCriacao.FactoryMethod.ImpressaoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorySegurancaTest {
    @Test
    void deveCriarSetorSeguranca() {
        FactorySetor setor = new FactorySeguranca();
        assertEquals(Seguranca.getInstancia(), setor.criarSetor());
    }
}