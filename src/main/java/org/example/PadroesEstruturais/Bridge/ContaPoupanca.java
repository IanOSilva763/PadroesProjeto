package org.example.PadroesEstruturais.Bridge;

public class ContaPoupanca implements Conta {
    @Override
    public String obterTipoConta() {
        return "Conta Poupança";
    }
}
