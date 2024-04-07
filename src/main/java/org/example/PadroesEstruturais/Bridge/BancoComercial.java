package org.example.PadroesEstruturais.Bridge;

class BancoComercial extends Banco {
    public BancoComercial(Conta conta) {
        super(conta);
    }

    @Override
    public String mostrarDetalhes() {
        return("Banco Comercial - " + conta.obterTipoConta());
    }
}