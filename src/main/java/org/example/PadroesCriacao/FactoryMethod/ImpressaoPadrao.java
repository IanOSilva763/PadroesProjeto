package org.example.PadroesCriacao.FactoryMethod;

import org.example.PadroesCriacao.FactoryMethod.Documentar;

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
