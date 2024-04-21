package org.example.PadroesEstruturais.FacadeBuilderFmethodSingleton;

public class FactorySeguranca implements FactorySetor {
    @Override
    public Setor criarSetor() {
        return Seguranca.getInstancia();
    }
}
