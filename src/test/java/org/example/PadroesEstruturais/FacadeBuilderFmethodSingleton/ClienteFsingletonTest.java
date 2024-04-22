package org.example.PadroesEstruturais.FacadeBuilderFmethodSingleton;

import org.example.PadroesCriacao.Singleton.ControleAcesso;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ClienteFsingletonTest {
    @Test
    public void deveCriarFinanceiro() {
        Setor financeiro = ClienteFacade.getInstance().criarFinanceiro();

        assertNotNull(financeiro);
        assertTrue(financeiro instanceof Financeiro);
    }

    @Test
    public void deveCriarConta() {
        Setor conta = ClienteFacade.getInstance().criarConta();

        assertNotNull(conta);
        assertTrue(conta instanceof Conta);
    }

    @Test
    public void deveCriarSeguranca() {
        Setor seguranca = ClienteFacade.getInstance().criarSeguranca();

        assertNotNull(seguranca);
        assertTrue(seguranca instanceof Seguranca);
    }
}
