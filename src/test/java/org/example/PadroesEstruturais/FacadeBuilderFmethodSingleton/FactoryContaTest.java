package org.example.PadroesEstruturais.FacadeBuilderFmethodSingleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryContaTest {
    @Test
    void deveCriarSetorConta() {
        FactorySetor setor = new FactoryConta();
        assertEquals(Conta.getInstancia(), setor.criarSetor());
    }
}