package org.example.FactoryMethod;

public class ImpressaoPadrao implements Documentar {
    @Override
    public String executar() {
        return "Impressão executada";
    }

    @Override
    public String cancelar() {
        return "Impressão cancelada";
    }
}
