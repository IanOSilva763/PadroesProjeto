package org.example.PadroesEstruturais.Bridge;

public abstract class Banco {
    protected Conta conta;
    public Banco(Conta conta) {
        this.conta = conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    abstract String mostrarDetalhes();
}
