package org.example.PadroesEstruturais.Bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BancoComercialTest {

    @Test
    void deveRetornarComercialContaCorrente() {
        Conta conta = new ContaCorrente();
        BancoComercial bancoComercial = new BancoComercial(conta);
        assertEquals("Banco Comercial - Conta Corrente", bancoComercial.mostrarDetalhes());
    }

    @Test
    void deveRetornarComercialContaPoupanca() {
        Conta conta = new ContaPoupanca();
        BancoComercial bancoComercial = new BancoComercial(conta);
        assertEquals("Banco Comercial - Conta Poupança", bancoComercial.mostrarDetalhes());
    }
}
