package org.example.Builder;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteBuilderTest {
    @Test
    void deveRetornarExcecaoClienteSemNome() {
        try {
            ClienteBuilder clienteBuilder = new ClienteBuilder();
            Cliente cliente = clienteBuilder
                    .setCpf("1")
                    .setRg("1")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoClienteSemCpf() {
        try {
            ClienteBuilder clienteBuilder = new ClienteBuilder();
            Cliente cliente = clienteBuilder
                    .setNome("a")
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
                    .setNome("a")
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
                .setNome("Cliente1")
                .setRg("2")
                .build();

        assertNotNull(cliente);
    }
}