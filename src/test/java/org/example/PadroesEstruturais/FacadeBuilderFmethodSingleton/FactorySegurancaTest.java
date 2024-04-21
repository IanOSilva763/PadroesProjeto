package org.example.PadroesEstruturais.FacadeBuilderFmethodSingleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorySegurancaTest {
    @Test
    void deveCriarSetorSeguranca() {
        FactorySetor setor = new FactorySeguranca();
        assertEquals(Seguranca.getInstancia(), setor.criarSetor());
    }
}