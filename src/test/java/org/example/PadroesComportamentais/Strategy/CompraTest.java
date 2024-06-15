package org.example.PadroesComportamentais.Strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompraTest {
    @Test
    void deveCalcularValorTotal() {
        Compra compra = new Compra();
        compra.LucroTotal(80.0f, 20.0f);
        assertEquals(100.0f, compra.getValor());
    }

    @Test
    void deveAnalisarProdutosVendidos() {
        Compra compra = new Compra();
        compra.ProdutosVendidos(80.0f, 12000.0f);
        assertEquals(151.0f, compra.getValor());
    }

    @Test
    void deveAnalisarLucroMensal() {
        Compra compra = new Compra();
        compra.LucroMensal(80.0f, 1200.0f);
        assertEquals(3200.0f, compra.getValor());
    }
}