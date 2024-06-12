package org.example.PadroesComportamentais.Iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IteracoesTest {
    @Test
    void testeQtFuncionariosAdministradoresSetor() {
        Setor setor = new Setor(
                new Funcionario("Gabriele", true),
                new Funcionario("Carol", true),
                new Funcionario("Jose", false),
                new Funcionario("Paulo", true),
                new Funcionario("Ian", false),
                new Funcionario("Julia", true)
        );
        assertEquals(4, Iteracao.qtFuncionariosAdministradoresSetor(setor));
    }

    @Test
    void deveContarTotalAlunosCurso() {
        Setor setor = new Setor(
                new Funcionario("Gabriele", true),
                new Funcionario("Carol", true),
                new Funcionario("Jose", false),
                new Funcionario("Paulo", true),
                new Funcionario("Ian", false),
                new Funcionario("Julia", true)
        );
        assertEquals(6, Iteracao.qtTotalFuncionariosSetor(setor));
    }
}