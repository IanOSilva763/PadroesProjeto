package org.example.PadroesEstruturais.Decorator;

public abstract class TextDecorator implements Text {

    private Text text;
    public String cor;

    public TextDecorator(Text text) {
        this.text = text;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public abstract String getNomeEscrita();

    public String getEscrita() {
        return this.text.getEscrita() + "/" + this.getNomeEscrita();
    }

    public abstract String getNomeCor();

    public String getCor() {
        return this.text.getCor() + "/" + this.getNomeCor();
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

//    public void setEscrita(String escrita) {
//        this.escrita = escrita;
//    }
}
