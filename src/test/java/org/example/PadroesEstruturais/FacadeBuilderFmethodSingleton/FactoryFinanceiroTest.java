package org.example.PadroesEstruturais.FacadeBuilderFmethodSingleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryFinanceiroTest {
    @Test
    void deveCriarSetorFinanceiro() {
        FactorySetor setor = new FactoryFinanceiro();
        assertEquals(Financeiro.getInstancia(), setor.criarSetor());
    }
}