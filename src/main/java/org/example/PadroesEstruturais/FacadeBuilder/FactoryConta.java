package org.example.PadroesEstruturais.FacadeBuilder;

public class FactoryConta implements FactorySetor {
    @Override
    public Setor criarSetor() {
        return Conta.getInstancia();
    }
}
