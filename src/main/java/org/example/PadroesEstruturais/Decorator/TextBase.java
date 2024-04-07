package org.example.PadroesEstruturais.Decorator;

public class TextBase implements Text {
    public String escrita;

    public TextBase() {
    }

    public TextBase(String escrita) {
        this.escrita = escrita;
    }

    public String getEscrita() {
        return escrita;
    }

    public String getCor() {
        return "Cor padrao";
    }
}
