package org.example.AbstractFactory;

public class Eletronicos {
    private Celular celular;
    private Notebook notebook;
    public Eletronicos(FabricaAbstrata fabrica) {
        this.celular = fabrica.createCelular();
        this.notebook = fabrica.createNotebook();
    }
    public String emitirCelular() {
        return this.celular.emitir();
    }
    public String emitirNotebook() {
        return this.notebook.emitir();
    }
}
