package org.example.PadroesEstruturais.FacadeBuilderFmethodSingleton;

public class Financeiro extends Setor{
    public static Financeiro financeiro = new Financeiro();

    private Financeiro() {};

    public static Financeiro getInstancia() {
        return financeiro;
    }
}
