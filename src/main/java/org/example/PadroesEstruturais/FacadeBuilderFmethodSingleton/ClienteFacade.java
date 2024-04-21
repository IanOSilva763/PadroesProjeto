package org.example.PadroesEstruturais.FacadeBuilderFmethodSingleton;

public class ClienteFacade {
    private static final ClienteFacade instance = new ClienteFacade();

    private FactorySetor factoryFinanceiro;
    private FactorySetor factoryConta;
    private FactorySetor factorySeguranca;

    private ClienteFacade() {
        this.factoryFinanceiro = new FactoryFinanceiro();
        this.factoryConta = new FactoryConta();
        this.factorySeguranca = new FactorySeguranca();
    }

    public static ClienteFacade getInstance() {
        return instance;
    }

    private FactorySetor FactoryFinanceiro;
    private FactorySetor FactoryConta;
    private FactorySetor FactorySeguranca;

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