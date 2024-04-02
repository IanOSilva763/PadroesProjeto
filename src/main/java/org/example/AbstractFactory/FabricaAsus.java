package org.example.AbstractFactory;

public class FabricaAsus implements FabricaAbstrata {
    @Override
    public Celular createCelular() {
        return new CelularAsus();
    }
    @Override
    public Notebook createNotebook() {
        return new NotebookAsus();
    }
}
