package org.example.PadroesEstruturais.Bridge;

public class ContaCorrente implements Conta {
    @Override
    public String obterTipoConta() {
        return "Conta Corrente";
    }
}
