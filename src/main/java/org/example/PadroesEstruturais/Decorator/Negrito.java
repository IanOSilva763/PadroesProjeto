package org.example.PadroesEstruturais.Decorator;

public class Negrito extends TextDecorator {
    public Negrito(Text text) {
        super(text);
    }

    public String getNomeEscrita() {
        return "Negrito";
    }

    public String getNomeCor() {
        return "Cor da palavra em negrito";
    }
}
