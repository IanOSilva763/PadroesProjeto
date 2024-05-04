package org.example.PadroesEstruturais.Proxy;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class CompradorProxyTest {
    @BeforeEach
    void setUp() {
        BancoDados.addComprador(new Comprador(1, "João", "36037-480", 123));
        BancoDados.addComprador(new Comprador(2, "Maria", "46074-372", 456));
    }

    @Test
    void deveRetornarDadosPessoais() {
        CompradorProxy comprador = new CompradorProxy(1);

        assertEquals(Arrays.asList("João", "36037-480"), comprador.obterDadosPessoais());
    }

    @Test
    void deveRetonarDadosCompra() {
        Funcionario funcionario = new Funcionario("Ana", true);
        CompradorProxy comprador = new CompradorProxy(2);

        assertEquals(Arrays.asList(2, 456), comprador.obterDadosCompra(funcionario));
    }

    @Test
    void deveRetonarExcecaoUsuarioNaoAutorizadoConsultarNotasAluno() {
        try {
            Funcionario funcionario = new Funcionario("Joana", false);
            CompradorProxy comprador = new CompradorProxy(2);

            comprador.obterDadosCompra(funcionario);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Funcionário não autorizado", e.getMessage());
        }
    }
}