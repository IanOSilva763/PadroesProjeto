package org.example.PadroesEstruturais.FacadeBuilder;

public class Conta extends Setor{
    public static Conta conta = new Conta();

    private Conta() {};

    public static Conta getInstancia() {
        return conta;
    }
}
