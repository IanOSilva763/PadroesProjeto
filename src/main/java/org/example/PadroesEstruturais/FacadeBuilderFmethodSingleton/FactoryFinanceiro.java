package org.example.PadroesEstruturais.FacadeBuilderFmethodSingleton;

public class FactoryFinanceiro implements FactorySetor {
    @Override
    public Setor criarSetor() {
        return Financeiro.getInstancia();
    }
}
