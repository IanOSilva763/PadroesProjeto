package org.example.FactoryMethod;

public class ImpressaoPretaBranca implements Documentar {

    @Override
    public String executar() {
        return "Impressão preta e branca executada";
    }

    @Override
    public String cancelar() {
        return "Impressão preta e branca cancelada";
    }
}
