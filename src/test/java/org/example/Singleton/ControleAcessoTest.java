package org.example.Singleton;

import org.example.PadroesCriacao.Singleton.ControleAcesso;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControleAcessoTest {

    @Test
    public void deveRetornarUsuario() {
        ControleAcesso.getInstance().setUsuario("usuario");
        assertEquals("usuario", ControleAcesso.getInstance().getUsuario());
    }

    @Test
    public void deveRetornarSenha() {
        ControleAcesso.getInstance().setSenha("senha");
        assertEquals("senha", ControleAcesso.getInstance().getSenha());
    }
}