package org.example.PadroesEstruturais.Decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextTest {
    @Test
    void deveRetornarEscrita() {
        Text text = new TextBase("Texto");

        assertEquals("Texto", text.getEscrita());
    }

    @Test
    void deveRetornarEscritaItalico() {
        Text text = new Italico(new TextBase("Texto"));

        assertEquals("Texto/Italico", text.getEscrita());
    }

    @Test
    void deveRetornarEscritaTamanho() {
        Text text = new Tamanho(new TextBase("Texto"));

        assertEquals("Texto/Texto com tamanho alterado", text.getEscrita());
    }

    @Test
    void deveRetornarEscritaNegrito() {
        Text text = new Negrito(new TextBase("Texto"));

        assertEquals("Texto/Negrito", text.getEscrita());
    }

    @Test
    void deveRetornarEscritaTamanhoItalico() {
        Text text = new Italico(new Tamanho(new TextBase("Texto")));

        assertEquals("Texto/Texto com tamanho alterado/Italico", text.getEscrita());
    }

    @Test
    void deveRetornarEscritaNegritoItalico() {
        Text text = new Italico(new Negrito(new TextBase("Texto")));

        assertEquals("Texto/Negrito/Italico", text.getEscrita());
    }

    @Test
    void deveRetornarEscritaNegritoTamanho() {
        Text text = new Tamanho(new Negrito(new TextBase("Texto")));

        assertEquals("Texto/Negrito/Texto com tamanho alterado", text.getEscrita());
    }

    @Test
    void deveRetornarEscritaNegritoTamanhoItalico() {
        Text text = new Italico(new Tamanho(new Negrito(new TextBase("Texto"))));

        assertEquals("Texto/Negrito/Texto com tamanho alterado/Italico", text.getEscrita());
    }

    @Test
    void deveRetornarCor() {
        Text text = new TextBase();

        assertEquals("Cor padrao", text.getCor());
    }

    @Test
    void deveRetornarCorItalico() {
        Text text = new Italico(new TextBase());

        assertEquals("Cor padrao/Cor do texto em italico", text.getCor());
    }

    @Test
    void deveRetornarCorTamanho() {
        Text text = new Tamanho(new TextBase());

        assertEquals("Cor padrao/Cor do texto com tamanho alterado", text.getCor());
    }

    @Test
    void deveRetornarCorNegrito() {
        Text text = new Negrito(new TextBase());

        assertEquals("Cor padrao/Cor da palavra em negrito", text.getCor());
    }

    @Test
    void deveRetornarCorTamanhoItalico() {
        Text text = new Italico(new Tamanho (new TextBase()));

        assertEquals("Cor padrao/Cor do texto com tamanho alterado/Cor do texto em italico", text.getCor());
    }

    @Test
    void deveRetornarCorNegritoItalico() {
        Text text = new Italico(new Negrito (new TextBase()));

        assertEquals("Cor padrao/Cor da palavra em negrito/Cor do texto em italico", text.getCor());
    }

    @Test
    void deveRetornarCorNegritoTamanho() {
        Text text = new Tamanho(new Negrito (new TextBase()));

        assertEquals("Cor padrao/Cor da palavra em negrito/Cor do texto com tamanho alterado", text.getCor());
    }

    @Test
    void deveRetornarCorNegritoTamanhoItalico() {
        Text text = new Italico (new Tamanho(new Negrito (new TextBase())));

        assertEquals("Cor padrao/Cor da palavra em negrito/Cor do texto com tamanho alterado/Cor do texto em italico", text.getCor());
    }
}