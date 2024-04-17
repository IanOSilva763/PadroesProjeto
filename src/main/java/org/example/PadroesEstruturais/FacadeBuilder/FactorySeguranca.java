package org.example.PadroesEstruturais.FacadeBuilder;

public class FactorySeguranca implements FactorySetor {
    @Override
    public Setor criarSetor() {
        return Seguranca.getInstancia();
    }
}
