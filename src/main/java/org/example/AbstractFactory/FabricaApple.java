package org.example.AbstractFactory;

public class FabricaApple implements FabricaAbstrata {
    @Override
    public Celular createCelular() {
        return new CelularApple();
    }
    @Override
    public Notebook createNotebook() { return new NotebookApple(); }
}
