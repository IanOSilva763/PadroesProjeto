package org.example.PadroesEstruturais.Bridge;

class BancoInvestimento extends Banco {

    public BancoInvestimento(Conta conta) {
        super(conta);
    }

    @Override
    public String mostrarDetalhes() {
        return("Banco de Investimento - " + conta.obterTipoConta());
    }
}


