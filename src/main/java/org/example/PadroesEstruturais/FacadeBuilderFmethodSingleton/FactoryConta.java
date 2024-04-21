package org.example.PadroesEstruturais.FacadeBuilderFmethodSingleton;

public class FactoryConta implements FactorySetor {
    @Override
    public Setor criarSetor() {
        return Conta.getInstancia();
    }
}
