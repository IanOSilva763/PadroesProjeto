package org.example.PadroesComportamentais.Memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GitTest {
    @Test
    void deveArmazenarCommits() {
        Git git = new Git();
        git.setCommit(GitCommitInicial.getInstance());
        git.setCommit(GitCommitEstrutura.getInstance());
        assertEquals(2, git.getCommits().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Git git = new Git();
        git.setCommit(GitCommitInicial.getInstance());
        git.setCommit(GitCommitEstrutura.getInstance());
        git.commitAnterior(0);
        assertEquals(GitCommitInicial.getInstance(), git.getCommit());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Git git = new Git();
        git.setCommit(GitCommitInicial.getInstance());
        git.setCommit(GitCommitEstrutura.getInstance());
        git.setCommit(GitCommitTratamentoExcecao.getInstance());
        git.setCommit(GitCommitConcluido.getInstance());
        git.commitAnterior(2);
        assertEquals(GitCommitTratamentoExcecao.getInstance(), git.getCommit());
    }

    @Test
    void deveRetornarInvalido() {
        try {
            Git git = new Git();
            git.commitAnterior(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}