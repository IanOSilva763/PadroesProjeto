package org.example.PadroesEstruturais.FacadeBuilder;

public class ClienteFacade {

    private FactorySetor FactoryFinanceiro;
    private FactorySetor FactoryConta;
    private FactorySetor FactorySeguranca;

    public ClienteFacade() {
        this.FactoryFinanceiro = new FactoryFinanceiro();
        this.FactoryConta = new FactoryConta();
        this.FactorySeguranca = new FactorySeguranca();
    }

    public static boolean verificarPendenciasDivida(Cliente cliente) {
        if (Conta.getInstancia().verificarClientesEndividados(cliente)) {
            return false;
        }
        if (Financeiro.getInstancia().verificarClientesEndividados(cliente)) {
            return false;
        }
        if (Seguranca.getInstancia().verificarClientesEndividados(cliente)) {
            return false;
        }
        return true;
    }

    public Setor criarFinanceiro() {
        return FactoryFinanceiro.criarSetor();
    }

    public Setor criarConta() {
        return FactoryConta.criarSetor();
    }

    public Setor criarSeguranca() {
        return FactorySeguranca.criarSetor();
    }
}

