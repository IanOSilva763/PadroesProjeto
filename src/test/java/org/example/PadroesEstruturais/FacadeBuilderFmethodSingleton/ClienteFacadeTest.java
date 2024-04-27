package org.example.PadroesEstruturais.FacadeBuilderFmethodSingleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteFacadeTest {

    @Test
    public void testVerificarPendenciasDividaComPendencias() {
        Cliente cliente1 = new ClienteBuilder()
                .setNome("João")
                .setCpf("12345678901")
                .setRg("1234567-8")
                .setNumCartao(1234)
                .build();

        Cliente cliente2 = new ClienteBuilder()
                .setNome("Maria")
                .setCpf("98765432109")
                .setRg("9876543-2")
                .setNumCartao(5678)
                .build();

        Conta.getInstancia().addClienteEndividado(cliente1);
        Conta.getInstancia().addClienteEndividado(cliente2);

        assertFalse(ClienteFacade.verificarPendenciasDivida(cliente1));
        assertFalse(ClienteFacade.verificarPendenciasDivida(cliente2));
    }

    @Test
    public void testVerificarPendenciasDividaSemPendencias() {
        Cliente clienteSemDivida = new ClienteBuilder()
                .setNome("Pedro")
                .setCpf("11111111111")
                .setRg("1111111-1")
                .setNumCartao(9999)
                .build();

        assertTrue(ClienteFacade.getInstance().verificarPendenciasDivida(clienteSemDivida));
    }
}
