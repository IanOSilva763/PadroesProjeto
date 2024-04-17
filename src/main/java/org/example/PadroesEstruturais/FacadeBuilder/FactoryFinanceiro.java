package org.example.PadroesEstruturais.FacadeBuilder;

public class FactoryFinanceiro implements FactorySetor {
    @Override
    public Setor criarSetor() {
        return Financeiro.getInstancia();
    }
}
