package org.example.PadroesEstruturais.Adapter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
class DadoTest {
    @Test
    void deveRetornarNoSql() {
        Dado dado = new Dado();
        dado.setDados("db.colecao.insertOne({ 'campo1': valor1, 'campo2': valor2, 'campo3': valor3});");

        assertEquals("db.colecao.insertOne({ 'campo1': valor1, 'campo2': valor2, 'campo3': valor3});", dado.getDados());
    }

    @Test
    void deveRetornarSql() {
        Dado dado = new Dado();
        dado.setDados("db.colecao.insertOne({ 'campo1': valor1, 'campo2': valor2, 'campo3': valor3});");

        assertEquals("INSERT INTO tabela (coluna1, coluna2, coluna3) VALUES (valor1, valor2, valor3);", dado.getSql());
    }
}