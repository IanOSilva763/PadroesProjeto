package org.example.PadroesEstruturais.Decorator;

public class Italico extends TextDecorator {
    public Italico(Text text) {
        super(text);
    }

    public String getNomeEscrita() {
        return "Italico";
    }

    public String getNomeCor() {
        return "Cor do texto em italico";
    }
}
