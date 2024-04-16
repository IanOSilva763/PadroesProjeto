package org.example.PadroesEstruturais.FacadeBuilder;

public class ClienteFacade {
    public static boolean verificarPendenciasDivida(Cliente cliente) {
        if (Conta.getInstancia().verificarClientesEndividados(cliente)) {
            return false;
        }
        if (Financeiro.getInstancia().verificarClientesEndividados(cliente)) {
            return false;
        }
        if (Seguranca.seguranca.verificarClientesEndividados(cliente)) {
            return false;
        }
        return true;
    }
}
