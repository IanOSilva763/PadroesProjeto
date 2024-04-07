package org.example.PadroesEstruturais.Decorator;

public class Tamanho extends TextDecorator {
    public Tamanho(Text text) {
        super(text);
    }

    public String getNomeEscrita() {
        return "Texto com tamanho alterado";
    }

    public String getNomeCor() {
        return "Cor do texto com tamanho alterado";
    }
}
