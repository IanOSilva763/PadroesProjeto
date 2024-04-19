package org.example.PadroesEstruturais.FacadeBuilder;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteFacadeTest {
    private Cliente cliente1;
    private Cliente cliente2;

    @Before
    public void setUp() {
        // Configuração inicial para os testes
        cliente1 = new ClienteBuilder()
                .setNome("João")
                .setCpf("12345678901")
                .setRg("1234567-8")
                .setNumCartao(1234)
                .build();

        cliente2 = new ClienteBuilder()
                .setNome("Maria")
                .setCpf("98765432109")
                .setRg("9876543-2")
                .setNumCartao(5678)
                .build();

        // Adicionando os clientes ao setor Conta para simular dívidas
        Conta.getInstancia().addClienteEndividado(cliente1);
        Conta.getInstancia().addClienteEndividado(cliente2);
    }

    @Test
    public void testVerificarPendenciasDividaComPendencias() {
        assertTrue(ClienteFacade.verificarPendenciasDivida(cliente1));
        assertTrue(ClienteFacade.verificarPendenciasDivida(cliente2));
    }

    @Test
    public void testVerificarPendenciasDividaSemPendencias() {
        Cliente clienteSemDivida = new ClienteBuilder()
                .setNome("Pedro")
                .setCpf("11111111111")
                .setRg("1111111-1")
                .setNumCartao(9999)
                .build();

        assertTrue(ClienteFacade.verificarPendenciasDivida(clienteSemDivida));
    }
}
