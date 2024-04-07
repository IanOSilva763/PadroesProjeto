package org.example.PadroesEstruturais.Bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BancoInvestimentoTest {
    @Test
    void deveRetornarInvestimentoContaCorrente() {
        Conta conta = new ContaCorrente();
        BancoInvestimento bancoInvestimento = new BancoInvestimento(conta);
        assertEquals("Banco de Investimento - Conta Corrente", bancoInvestimento.mostrarDetalhes());
    }

    @Test
    void deveRetornarInvestimentoContaPoupanca() {
        Conta conta = new ContaPoupanca();
        BancoInvestimento bancoInvestimento = new BancoInvestimento(conta);
        assertEquals("Banco de Investimento - Conta Poupança", bancoInvestimento.mostrarDetalhes());
    }
}