package org.example.PadroesEstruturais.FacadeBuilder;

import org.example.PadroesEstruturais.FacadeBuilder.Cliente;
import org.example.PadroesEstruturais.FacadeBuilder.ClienteBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteBuilderTest {
    @Test
    void deveRetornarExcecaoClienteSemNumCartao() {
        try {
            ClienteBuilder clienteBuilder = new ClienteBuilder();
            Cliente cliente = clienteBuilder
                    .setCpf("1")
                    .setRg("1")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número do cartão inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoClienteSemCpf() {
        try {
            ClienteBuilder clienteBuilder = new ClienteBuilder();
            Cliente cliente = clienteBuilder
                    .setNumCartao(1)
                    .setRg("1")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Cpf inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoClienteSemRg() {
        try {
            ClienteBuilder clienteBuilder = new ClienteBuilder();
            Cliente cliente = clienteBuilder
                    .setNumCartao(1)
                    .setCpf("1")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Rg inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarClienteValido() {
        ClienteBuilder clienteBuilder = new ClienteBuilder();
        Cliente cliente = clienteBuilder
                .setCpf("1")
                .setNumCartao(1)
                .setRg("2")
                .build();

        assertNotNull(cliente);
    }
}